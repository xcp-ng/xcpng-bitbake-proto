
PN = "perl-File-Slurp"
PE = "0"
PV = "9999.32"
PR = "17.el10"
PACKAGES = "perl-File-Slurp perl-File-Slurp-tests"


URI_perl-File-Slurp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-File-Slurp-9999.32-17.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-File-Slurp = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Carp) ( ) perl(Exporter) ( ) perl(File::Spec) ( ) perl(POSIX) ( ) perl(File::Basename) ( ) perl(Fcntl) ( ) perl(File::Temp) ( ) perl(IO::Handle) ( ) perl(Errno) ( ) perl(re) ( )"
RPROVIDES:perl-File-Slurp = "perl(File::Slurp) ( =  9999.32) perl-File-Slurp ( =  9999.32-17.el10)"

URI_perl-File-Slurp-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-File-Slurp-tests-9999.32-17.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-File-Slurp-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(File::Spec) ( ) perl(lib) ( ) perl(Exporter) ( ) perl(Carp) ( ) perl(File::Temp) ( ) perl(IO::Handle) ( ) perl(overload) ( ) perl(File::Basename) ( ) perl(Scalar::Util) ( ) perl(POSIX) ( ) perl(Fcntl) ( ) perl(Symbol) ( ) perl(Socket) ( ) perl(File::Slurp) ( ) perl-File-Slurp ( =  9999.32-17.el10)"
RPROVIDES:perl-File-Slurp-tests = "perl-File-Slurp-tests ( =  9999.32-17.el10)"
