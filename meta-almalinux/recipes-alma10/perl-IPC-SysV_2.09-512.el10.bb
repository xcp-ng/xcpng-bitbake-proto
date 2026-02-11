
PN = "perl-IPC-SysV"
PE = "0"
PV = "2.09"
PR = "512.el10"
PACKAGES = "perl-IPC-SysV perl-IPC-SysV-tests"


URI_perl-IPC-SysV = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-IPC-SysV-2.09-512.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-IPC-SysV = " \
 perl-libs \
 perl-Carp \
 perl-vars \
 perl-Class-Struct \
 perl-IPC-SysV \
 glibc \
 perl-Exporter \
"

URI_perl-IPC-SysV-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-IPC-SysV-tests-2.09-512.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-IPC-SysV-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-IPC-SysV \
 bash \
 perl-interpreter \
"
