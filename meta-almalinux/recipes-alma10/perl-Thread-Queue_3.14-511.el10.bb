
inherit dnf-bridge

PN = "perl-Thread-Queue"
PE = "0"
PV = "3.14"
PR = "511.el10"
PACKAGES = "perl-Thread-Queue perl-Thread-Queue-tests"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/perl-Thread-Queue-3.14-511.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-Thread-Queue = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Thread-Queue-3.14-511.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Thread-Queue}"
RDEPENDS:perl-Thread-Queue = " \
 perl-threads-shared \
 perl-Scalar-List-Utils \
 perl-libs \
 perl-Carp \
"

URI_perl-Thread-Queue-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Thread-Queue-tests-3.14-511.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Thread-Queue-tests}"
RDEPENDS:perl-Thread-Queue-tests = " \
 perl-threads \
 perl-threads-shared \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-Scalar-List-Utils \
 perl-Thread-Queue \
 bash \
 perl-Thread-Semaphore \
 perl-interpreter \
 perl-Exporter \
"
