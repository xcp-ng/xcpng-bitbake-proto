
PN = "perl-Module-Install-AuthorRequires"
PE = "0"
PV = "0.02"
PR = "36.el10"
PACKAGES = "perl-Module-Install-AuthorRequires perl-Module-Install-AuthorRequires-tests"


URI_perl-Module-Install-AuthorRequires = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Module-Install-AuthorRequires-0.02-36.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Module-Install-AuthorRequires = "perl(strict) ( ) perl(warnings) ( ) perl-libs ( ) perl(base) ( ) perl(Module::Install::Base) ( )"
RPROVIDES:perl-Module-Install-AuthorRequires = "perl-Module-Install-AuthorRequires ( =  0.02-36.el10) perl(Module::Install::Admin::AuthorRequires) ( =  0.02) perl(Module::Install::AuthorRequires) ( =  0.02)"

URI_perl-Module-Install-AuthorRequires-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Module-Install-AuthorRequires-tests-0.02-36.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Module-Install-AuthorRequires-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl-Module-Install-AuthorRequires ( =  0.02-36.el10)"
RPROVIDES:perl-Module-Install-AuthorRequires-tests = "perl-Module-Install-AuthorRequires-tests ( =  0.02-36.el10)"
