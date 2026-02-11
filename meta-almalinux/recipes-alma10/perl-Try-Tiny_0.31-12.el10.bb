
PN = "perl-Try-Tiny"
PE = "0"
PV = "0.31"
PR = "12.el10"
PACKAGES = "perl-Try-Tiny perl-Try-Tiny-tests"


URI_perl-Try-Tiny = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Try-Tiny-0.31-12.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Try-Tiny = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Carp) ( ) perl(constant) ( ) perl(Sub::Util) ( ) perl(:VERSION) ( >=  5.6.0) perl(Exporter) ( >=  5.57)"
RPROVIDES:perl-Try-Tiny = "perl(Try::Tiny) ( =  0.31) perl-Try-Tiny ( =  0.31-12.el10)"

URI_perl-Try-Tiny-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Try-Tiny-tests-0.31-12.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Try-Tiny-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(File::Spec) ( ) perl(ExtUtils::MakeMaker) ( ) perl(Try::Tiny) ( ) perl(:VERSION) ( >=  5.10.0) perl-Try-Tiny ( =  0.31-12.el10)"
RPROVIDES:perl-Try-Tiny-tests = "perl-Try-Tiny-tests ( =  0.31-12.el10)"
