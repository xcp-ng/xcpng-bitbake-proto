
inherit dnf-bridge

PN = "perl-Carp-Clan"
PE = "0"
PV = "6.08"
PR = "20.el10"
PACKAGES = "perl-Carp-Clan perl-Carp-Clan-tests"


URI_perl-Carp-Clan = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Carp-Clan-6.08-20.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Carp-Clan = " \
 perl-overload \
 perl-libs \
"

URI_perl-Carp-Clan-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Carp-Clan-tests-6.08-20.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Carp-Clan-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-ExtUtils-MakeMaker \
 perl-Carp-Clan \
 perl-overload \
 bash \
 perl-PathTools \
 perl-Object-Deadly \
 perl-interpreter \
"
