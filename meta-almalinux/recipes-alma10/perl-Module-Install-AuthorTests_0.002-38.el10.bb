
PN = "perl-Module-Install-AuthorTests"
PE = "0"
PV = "0.002"
PR = "38.el10"
PACKAGES = "perl-Module-Install-AuthorTests perl-Module-Install-AuthorTests-tests"


URI_perl-Module-Install-AuthorTests = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Module-Install-AuthorTests-0.002-38.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Module-Install-AuthorTests = "perl(strict) ( ) perl-libs ( ) perl(Carp) ( ) perl(vars) ( ) perl(Module::Install::Base) ( ) perl(Module::Install) ( ) perl(:VERSION) ( >=  5.5.0)"
RPROVIDES:perl-Module-Install-AuthorTests = "perl(Module::Install::AuthorTests) ( =  0.002) perl-Module-Install-AuthorTests ( =  0.002-38.el10)"

URI_perl-Module-Install-AuthorTests-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Module-Install-AuthorTests-tests-0.002-38.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Module-Install-AuthorTests-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(Module::Install::AuthorTests) ( ) perl-Module-Install-AuthorTests ( =  0.002-38.el10)"
RPROVIDES:perl-Module-Install-AuthorTests-tests = "perl-Module-Install-AuthorTests-tests ( =  0.002-38.el10)"
