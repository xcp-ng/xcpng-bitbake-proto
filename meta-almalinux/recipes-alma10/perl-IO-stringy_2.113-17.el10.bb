
PN = "perl-IO-stringy"
PE = "0"
PV = "2.113"
PR = "17.el10"
PACKAGES = "perl-IO-stringy perl-IO-stringy-tests"


URI_perl-IO-stringy = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-IO-stringy-2.113-17.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-IO-stringy = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Exporter) ( ) perl(Carp) ( ) perl(vars) ( ) perl(IO::Handle) ( ) perl(overload) ( ) perl(IO::File) ( ) perl(Symbol) ( ) perl(parent) ( ) perl(FileHandle) ( ) perl(IO::ScalarArray) ( ) perl(IO::WrapTie) ( )"
RPROVIDES:perl-IO-stringy = "perl(IO::AtomicFile) ( =  2.113) perl(IO::InnerFile) ( =  2.113) perl(IO::Lines) ( =  2.113) perl(IO::Scalar) ( =  2.113) perl(IO::ScalarArray) ( =  2.113) perl(IO::Stringy) ( =  2.113) perl(IO::Wrap) ( =  2.113) perl(IO::WrapTie) ( =  2.113) perl-IO-Stringy ( =  2.113-17.el10) perl-IO-stringy ( =  2.113-17.el10)"

URI_perl-IO-stringy-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-IO-stringy-tests-2.113-17.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-IO-stringy-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(File::Spec) ( ) perl(File::Temp) ( ) perl(IO::Handle) ( ) perl(ExtUtils::MakeMaker) ( ) perl(IO::File) ( ) perl(Symbol) ( ) perl(IO::InnerFile) ( ) perl(IO::Lines) ( ) perl(IO::Scalar) ( ) perl(IO::ScalarArray) ( ) perl(IO::WrapTie) ( ) perl-IO-stringy ( =  2.113-17.el10)"
RPROVIDES:perl-IO-stringy-tests = "perl-IO-stringy-tests ( =  2.113-17.el10)"
