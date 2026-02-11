
PN = "perl-IO-String"
PE = "0"
PV = "1.08"
PR = "53.el10"
PACKAGES = "perl-IO-String perl-IO-String-tests"


URI_perl-IO-String = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-IO-String-1.08-53.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-IO-String = "perl(strict) ( ) perl-libs ( ) perl(vars) ( ) perl(Data::Dumper) ( ) perl(IO::Handle) ( ) perl(Symbol) ( ) perl(:VERSION) ( >=  5.5.0)"
RPROVIDES:perl-IO-String = "perl(IO::String) ( =  1.08) perl-IO-String ( =  1.08-53.el10)"

URI_perl-IO-String-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-IO-String-tests-1.08-53.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-IO-String-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(vars) ( ) perl(Test) ( ) perl-IO-String ( =  1.08-53.el10) perl(IO::String) ( >=  0.01)"
RPROVIDES:perl-IO-String-tests = "perl-IO-String-tests ( =  1.08-53.el10)"
