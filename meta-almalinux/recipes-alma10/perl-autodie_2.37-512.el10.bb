
PN = "perl-autodie"
PE = "0"
PV = "2.37"
PR = "512.el10"
PACKAGES = "perl-autodie perl-autodie-tests"


URI_perl-autodie = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-autodie-2.37-512.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-autodie = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Carp) ( ) perl(constant) ( ) perl(Config) ( ) perl(POSIX) ( ) perl(overload) ( ) perl(Fcntl) ( ) perl(Scalar::Util) ( ) perl(parent) ( ) perl(B) ( ) perl(Fatal) ( ) perl(Tie::RefHash) ( ) perl(autodie::Scope::Guard) ( ) perl(autodie::Scope::GuardStack) ( ) perl(autodie::Util) ( ) perl(autodie::exception) ( ) perl(:VERSION) ( >=  5.8.0) perl(Exporter) ( >=  5.57) perl(IPC::System::Simple) ( >=  0.12)"
RPROVIDES:perl-autodie = "perl(Fatal) ( =  2.37) perl(autodie) ( =  2.37) perl(autodie::Scope::Guard) ( =  2.37) perl(autodie::Scope::GuardStack) ( =  2.37) perl(autodie::Util) ( =  2.37) perl(autodie::exception) ( =  2.37) perl(autodie::exception::system) ( =  2.37) perl(autodie::hints) ( =  2.37) perl(autodie::skip) ( =  2.37) perl-autodie ( =  2.37-512.el10)"

URI_perl-autodie-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-autodie-tests-2.37-512.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-autodie-tests = "perl(strict) ( ) /usr/bin/perl ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) /usr/bin/bash ( ) perl(File::Spec) ( ) perl(lib) ( ) perl(Config) ( ) perl(File::Temp) ( ) perl(IO::Handle) ( ) perl(constant) ( ) perl(Scalar::Util) ( ) perl(POSIX) ( ) perl(FindBin) ( ) perl(Fcntl) ( ) perl(Socket) ( ) perl(File::Copy) ( ) perl(parent) ( ) perl(open) ( ) perl(Import::Into) ( ) perl(BSD::Resource) ( ) perl(Fatal) ( ) perl(autodie) ( ) perl(autodie::exception) ( ) perl(autodie::exception::system) ( ) perl(autodie::hints) ( ) perl(autodie::skip) ( ) perl(Exporter) ( >=  5.57) perl(:VERSION) ( >=  5.10.0) perl-autodie ( =  2.37-512.el10) perl(Import::Into) ( >=  1.002004)"
RPROVIDES:perl-autodie-tests = "perl-autodie-tests ( =  2.37-512.el10)"
