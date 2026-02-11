
PN = "perl-Class-Inspector"
PE = "0"
PV = "1.36"
PR = "19.el10"
PACKAGES = "perl-Class-Inspector perl-Class-Inspector-tests"


URI_perl-Class-Inspector = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Class-Inspector-1.36-19.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Class-Inspector = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Exporter) ( ) perl(File::Spec) ( ) perl(base) ( ) perl(Class::Inspector) ( ) perl(:VERSION) ( >=  5.6.0)"
RPROVIDES:perl-Class-Inspector = "perl(Class::Inspector) ( =  1.36) perl(Class::Inspector::Functions) ( =  1.36) perl-Class-Inspector ( =  1.36-19.el10)"

URI_perl-Class-Inspector-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Class-Inspector-tests-1.36-19.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Class-Inspector-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(Config) ( ) perl(vars) ( ) perl(base) ( ) perl(constant) ( ) perl(Class::Inspector) ( ) perl(Class::Inspector::Functions) ( ) perl-Class-Inspector ( =  1.36-19.el10)"
RPROVIDES:perl-Class-Inspector-tests = "perl-Class-Inspector-tests ( =  1.36-19.el10)"
