
PN = "perl-Carp-Clan"
PE = "0"
PV = "6.08"
PR = "20.el10"
PACKAGES = "perl-Carp-Clan perl-Carp-Clan-tests"


URI_perl-Carp-Clan = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Carp-Clan-6.08-20.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Carp-Clan = "perl(strict) ( ) perl-libs ( ) perl(overload) ( )"
RPROVIDES:perl-Carp-Clan = "perl(Carp::Clan) ( =  6.08) perl-Carp-Clan ( =  6.08-20.el10)"

URI_perl-Carp-Clan-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Carp-Clan-tests-6.08-20.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Carp-Clan-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(File::Spec) ( ) perl(overload) ( ) perl(ExtUtils::MakeMaker) ( ) perl(Object::Deadly) ( ) perl-Carp-Clan ( =  6.08-20.el10)"
RPROVIDES:perl-Carp-Clan-tests = "perl-Carp-Clan-tests ( =  6.08-20.el10)"
