
inherit dnf-bridge

PN = "perl-File-Which"
PE = "0"
PV = "1.27"
PR = "14.el10"
PACKAGES = "perl-File-Which perl-File-Which-tests"


URI_perl-File-Which = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-File-Which-1.27-14.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-File-Which = " \
 perl-constant \
 perl-libs \
 perl-PathTools \
 perl-Exporter \
 perl-base \
"

URI_perl-File-Which-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-File-Which-tests-1.27-14.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-File-Which-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 bash \
 perl-Env \
 perl-interpreter \
 perl-File-Which \
"
