
inherit dnf-bridge

PN = "perl-autodie"
PE = "0"
PV = "2.37"
PR = "512.el10"
PACKAGES = "perl-autodie perl-autodie-tests"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/perl-autodie-2.37-512.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-autodie = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-autodie-2.37-512.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-autodie}"
RDEPENDS:perl-autodie = " \
 perl-constant \
 perl-Scalar-List-Utils \
 perl-libs \
 perl-Carp \
 perl-Fcntl \
 perl-POSIX \
 perl-overload \
 perl-IPC-System-Simple \
 perl-parent \
 perl-B \
 perl-autodie \
 perl-Exporter \
 perl-Tie-RefHash \
"

URI_perl-autodie-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-autodie-tests-2.37-512.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-autodie-tests}"
RDEPENDS:perl-autodie-tests = " \
 perl-Scalar-List-Utils \
 perl-libs \
 perl-Import-Into \
 perl-FindBin \
 perl-Socket \
 perl-open \
 perl-parent \
 perl-BSD-Resource \
 perl-Test-Harness \
 perl-Test-Simple \
 perl-IO \
 perl-lib \
 bash \
 perl-autodie \
 perl-Exporter \
 perl-constant \
 perl-Fcntl \
 perl-POSIX \
 perl-File-Copy \
 perl-PathTools \
 perl-interpreter \
 perl-File-Temp \
"
