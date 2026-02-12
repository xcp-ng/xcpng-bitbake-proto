
inherit dnf-bridge

PN = "perl-IPC-System-Simple"
PE = "0"
PV = "1.30"
PR = "16.el10"
PACKAGES = "perl-IPC-System-Simple perl-IPC-System-Simple-tests"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/perl-IPC-System-Simple-1.30-16.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-IPC-System-Simple = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-IPC-System-Simple-1.30-16.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-IPC-System-Simple}"
RDEPENDS:perl-IPC-System-Simple = " \
 perl-constant \
 perl-Scalar-List-Utils \
 perl-libs \
 perl-Carp \
 perl-POSIX \
 perl-Exporter \
"

URI_perl-IPC-System-Simple-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-IPC-System-Simple-tests-1.30-16.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-IPC-System-Simple-tests}"
RDEPENDS:perl-IPC-System-Simple-tests = " \
 perl-constant \
 perl-Test \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-Scalar-List-Utils \
 perl-File-Basename \
 bash \
 perl-IPC-System-Simple \
 perl-interpreter \
"
