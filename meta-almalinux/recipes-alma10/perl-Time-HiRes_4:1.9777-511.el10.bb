
inherit dnf-bridge

PN = "perl-Time-HiRes"
PE = "4"
PV = "1.9777"
PR = "511.el10"
PACKAGES = "perl-Time-HiRes perl-Time-HiRes-tests"


URI_perl-Time-HiRes = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Time-HiRes-1.9777-511.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Time-HiRes = " \
 glibc \
 perl-Exporter \
 perl-libs \
 perl-Carp \
"

URI_perl-Time-HiRes-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Time-HiRes-tests-1.9777-511.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Time-HiRes-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-File-Basename \
 bash \
 perl-Time-HiRes \
 perl-interpreter \
 perl-File-Temp \
"
