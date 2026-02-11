
PN = "perl-Term-Cap"
PE = "0"
PV = "1.18"
PR = "511.el10"
PACKAGES = "perl-Term-Cap perl-Term-Cap-tests"


URI_perl-Term-Cap = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Term-Cap-1.18-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Term-Cap = "perl(strict) ( ) perl-libs ( ) perl(Carp) ( ) perl(vars) ( ) ncurses ( )"
RPROVIDES:perl-Term-Cap = "perl(Term::Cap) ( =  1.18) perl-Term-Cap ( =  1.18-511.el10)"

URI_perl-Term-Cap-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Term-Cap-tests-1.18-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Term-Cap-tests = "/usr/bin/perl ( ) perl-Test-Harness ( ) perl(Test::More) ( ) /usr/bin/bash ( ) perl-Term-Cap ( =  1.18-511.el10)"
RPROVIDES:perl-Term-Cap-tests = "perl-Term-Cap-tests ( =  1.18-511.el10)"
