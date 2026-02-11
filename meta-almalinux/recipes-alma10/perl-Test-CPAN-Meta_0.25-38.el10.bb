
PN = "perl-Test-CPAN-Meta"
PE = "0"
PV = "0.25"
PR = "38.el10"
PACKAGES = "perl-Test-CPAN-Meta perl-Test-CPAN-Meta-tests"


URI_perl-Test-CPAN-Meta = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Test-CPAN-Meta-0.25-38.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Test-CPAN-Meta = "perl(strict) ( ) perl(warnings) ( ) perl(vars) ( ) perl-libs ( ) perl(Test::Builder) ( ) perl(Parse::CPAN::Meta) ( ) perl(Test::CPAN::Meta::Version) ( )"
RPROVIDES:perl-Test-CPAN-Meta = "perl-Test-CPAN-Meta ( =  0.25-38.el10) perl(Test::CPAN::Meta) ( =  0.25) perl(Test::CPAN::Meta::Version) ( =  0.25)"

URI_perl-Test-CPAN-Meta-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Test-CPAN-Meta-tests-0.25-38.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Test-CPAN-Meta-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(Test::More) ( ) perl(IO::File) ( ) perl(Parse::CPAN::Meta) ( ) perl(Test::Builder::Tester) ( ) perl(Test::CPAN::Meta::Version) ( ) perl(Test::CPAN::Meta) ( ) perl-Test-CPAN-Meta ( =  0.25-38.el10)"
RPROVIDES:perl-Test-CPAN-Meta-tests = "perl-Test-CPAN-Meta-tests ( =  0.25-38.el10)"
