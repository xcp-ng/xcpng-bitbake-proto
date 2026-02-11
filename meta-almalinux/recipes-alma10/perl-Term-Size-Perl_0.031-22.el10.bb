
PN = "perl-Term-Size-Perl"
PE = "0"
PV = "0.031"
PR = "22.el10"
PACKAGES = "perl-Term-Size-Perl perl-Term-Size-Perl-tests"


URI_perl-Term-Size-Perl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Term-Size-Perl-0.031-22.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Term-Size-Perl = "perl(strict) ( ) perl-libs ( ) perl(Exporter) ( ) perl(vars) ( ) perl(Term::Size::Perl::Params) ( )"
RPROVIDES:perl-Term-Size-Perl = "perl(Term::Size::Perl) ( =  0.031) perl(Term::Size::Perl::Params) ( =  0.031) perl-Term-Size-Perl ( =  0.031-22.el10) perl-Term-Size-Perl(x86-64) ( =  0.031-22.el10)"

URI_perl-Term-Size-Perl-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Term-Size-Perl-tests-0.031-22.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Term-Size-Perl-tests = "/usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(Test::More) ( ) perl-Term-Size-Perl ( =  0.031-22.el10)"
RPROVIDES:perl-Term-Size-Perl-tests = "perl-Term-Size-Perl-tests ( =  0.031-22.el10) perl-Term-Size-Perl-tests(x86-64) ( =  0.031-22.el10)"
