
PN = "perl-IPC-System-Simple"
PE = "0"
PV = "1.30"
PR = "16.el10"
PACKAGES = "perl-IPC-System-Simple perl-IPC-System-Simple-tests"


URI_perl-IPC-System-Simple = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-IPC-System-Simple-1.30-16.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-IPC-System-Simple = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Carp) ( ) perl(Exporter) ( ) perl(constant) ( ) perl(Config) ( ) perl(POSIX) ( ) perl(Scalar::Util) ( ) perl(re) ( ) perl(List::Util) ( ) perl(:VERSION) ( >=  5.6.0)"
RPROVIDES:perl-IPC-System-Simple = "perl(IPC::System::Simple) ( =  1.30) perl-IPC-System-Simple ( =  1.30-16.el10)"

URI_perl-IPC-System-Simple-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-IPC-System-Simple-tests-1.30-16.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-IPC-System-Simple-tests = "perl(strict) ( ) /usr/bin/perl ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) /usr/bin/bash ( ) perl(Config) ( ) perl(constant) ( ) perl(File::Basename) ( ) perl(Scalar::Util) ( ) perl(Test) ( ) perl(IPC::System::Simple) ( ) perl-IPC-System-Simple ( =  1.30-16.el10)"
RPROVIDES:perl-IPC-System-Simple-tests = "perl-IPC-System-Simple-tests ( =  1.30-16.el10)"
