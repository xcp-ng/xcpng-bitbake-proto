
PN = "perl-Term-Size-Any"
PE = "0"
PV = "0.002"
PR = "45.el10"
PACKAGES = "perl-Term-Size-Any perl-Term-Size-Any-tests"


URI_perl-Term-Size-Any = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Term-Size-Any-0.002-45.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Term-Size-Any = "perl(strict) ( ) perl-libs ( ) perl(vars) ( ) perl(Term::Size::Perl) ( )"
RPROVIDES:perl-Term-Size-Any = "perl(Term::Size::Any) ( =  0.002) perl-Term-Size-Any ( =  0.002-45.el10)"

URI_perl-Term-Size-Any-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Term-Size-Any-tests-0.002-45.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Term-Size-Any-tests = "/usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(Test::More) ( ) perl(Module::Load::Conditional) ( ) perl-Term-Size-Any ( =  0.002-45.el10)"
RPROVIDES:perl-Term-Size-Any-tests = "perl-Term-Size-Any-tests ( =  0.002-45.el10)"
