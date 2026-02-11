
PN = "perl-Date-Calc"
PE = "0"
PV = "6.4"
PR = "30.el10"
PACKAGES = "perl-Date-Calc perl-Date-Calc-tests"


URI_perl-Date-Calc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Date-Calc-6.4-30.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Date-Calc = "perl(strict) ( ) perl-libs ( ) perl(Exporter) ( ) perl(vars) ( ) perl(POSIX) ( ) perl(overload) ( ) perl(Date::Calc) ( ) perl(Date::Calc::Object) ( ) perl(Date::Calendar::Year) ( ) perl(Bit::Vector) ( >=  7.1) perl(Carp::Clan) ( >=  6.04)"
RPROVIDES:perl-Date-Calc = "perl(Date::Calc) ( =  6.4) perl(Date::Calc::Object) ( =  6.4) perl(Date::Calc::PP) ( =  6.4) perl(Date::Calendar) ( =  6.4) perl(Date::Calendar::Profiles) ( =  6.4) perl(Date::Calendar::Year) ( =  6.4) perl-Date-Calc ( =  6.4-30.el10)"

URI_perl-Date-Calc-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Date-Calc-tests-6.4-30.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Date-Calc-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(Date::Calc) ( ) perl(Date::Calc::Object) ( ) perl(Date::Calendar) ( ) perl(Date::Calendar::Profiles) ( ) perl(Date::Calendar::Year) ( ) perl-Date-Calc ( =  6.4-30.el10)"
RPROVIDES:perl-Date-Calc-tests = "perl-Date-Calc-tests ( =  6.4-30.el10)"
