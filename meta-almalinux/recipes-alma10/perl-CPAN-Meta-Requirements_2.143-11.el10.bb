
PN = "perl-CPAN-Meta-Requirements"
PE = "0"
PV = "2.143"
PR = "11.el10"
PACKAGES = "perl-CPAN-Meta-Requirements perl-CPAN-Meta-Requirements-tests"


URI_perl-CPAN-Meta-Requirements = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-CPAN-Meta-Requirements-2.143-11.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-CPAN-Meta-Requirements = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Carp) ( ) perl(B) ( ) perl(CPAN::Meta::Requirements::Range) ( ) perl(:VERSION) ( >=  5.10.0) perl(version) ( >=  0.88)"
RPROVIDES:perl-CPAN-Meta-Requirements = "perl(CPAN::Meta::Requirements) ( =  2.143000) perl(CPAN::Meta::Requirements::Range) ( =  2.141) perl-CPAN-Meta-Requirements ( =  2.143-11.el10)"

URI_perl-CPAN-Meta-Requirements-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-CPAN-Meta-Requirements-tests-2.143-11.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-CPAN-Meta-Requirements-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(File::Spec) ( ) perl(ExtUtils::MakeMaker) ( ) perl(version) ( ) perl(CPAN::Meta::Requirements) ( ) perl(CPAN::Meta::Requirements::Range) ( ) perl(Test::More) ( >=  0.88) perl-CPAN-Meta-Requirements ( =  2.143-11.el10)"
RPROVIDES:perl-CPAN-Meta-Requirements-tests = "perl-CPAN-Meta-Requirements-tests ( =  2.143-11.el10)"
