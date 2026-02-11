
PN = "perl-Mozilla-CA"
PE = "0"
PV = "20231213"
PR = "5.el10"
PACKAGES = "perl-Mozilla-CA perl-Mozilla-CA-tests"


URI_perl-Mozilla-CA = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Mozilla-CA-20231213-5.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Mozilla-CA = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(File::Spec) ( ) ca-certificates ( )"
RPROVIDES:perl-Mozilla-CA = "perl(Mozilla::CA) ( =  20231213) perl-Mozilla-CA ( =  20231213-5.el10)"

URI_perl-Mozilla-CA-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Mozilla-CA-tests-20231213-5.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Mozilla-CA-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(Mozilla::CA) ( ) perl-Mozilla-CA ( =  20231213-5.el10)"
RPROVIDES:perl-Mozilla-CA-tests = "perl-Mozilla-CA-tests ( =  20231213-5.el10)"
