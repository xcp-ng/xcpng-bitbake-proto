
PN = "perl-Parse-PMFile"
PE = "0"
PV = "0.45"
PR = "3.el10"
PACKAGES = "perl-Parse-PMFile perl-Parse-PMFile-tests"


URI_perl-Parse-PMFile = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Parse-PMFile-0.45-3.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Parse-PMFile = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(File::Spec) ( ) perl(Safe) ( ) perl(Dumpvalue) ( ) perl(JSON::PP) ( >=  2.00) perl(version) ( >=  0.83)"
RPROVIDES:perl-Parse-PMFile = "perl(Parse::PMFile) ( =  0.45) perl-Parse-PMFile ( =  0.45-3.el10)"

URI_perl-Parse-PMFile-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Parse-PMFile-tests-0.45-3.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Parse-PMFile-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(File::Temp) ( ) perl(FindBin) ( ) perl(Safe) ( ) perl(Opcode) ( ) perl(Parse::PMFile) ( ) perl-Parse-PMFile ( =  0.45-3.el10)"
RPROVIDES:perl-Parse-PMFile-tests = "perl-Parse-PMFile-tests ( =  0.45-3.el10)"
