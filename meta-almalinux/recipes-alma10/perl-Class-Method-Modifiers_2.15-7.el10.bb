
PN = "perl-Class-Method-Modifiers"
PE = "0"
PV = "2.15"
PR = "7.el10"
PACKAGES = "perl-Class-Method-Modifiers perl-Class-Method-Modifiers-tests"


URI_perl-Class-Method-Modifiers = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Class-Method-Modifiers-2.15-7.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Class-Method-Modifiers = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Exporter) ( ) perl(Carp) ( ) perl(base) ( ) perl(B) ( )"
RPROVIDES:perl-Class-Method-Modifiers = "perl(Class::Method::Modifiers) ( =  2.15) perl-Class-Method-Modifiers ( =  2.15-7.el10)"

URI_perl-Class-Method-Modifiers-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Class-Method-Modifiers-tests-2.15-7.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Class-Method-Modifiers-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(File::Spec) ( ) perl(ExtUtils::MakeMaker) ( ) perl(B) ( ) perl(if) ( ) perl(Class::Method::Modifiers) ( ) perl(Test::More) ( >=  0.88) perl-Class-Method-Modifiers ( =  2.15-7.el10)"
RPROVIDES:perl-Class-Method-Modifiers-tests = "perl-Class-Method-Modifiers-tests ( =  2.15-7.el10)"
