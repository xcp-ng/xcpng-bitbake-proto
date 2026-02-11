
PN = "perl-Capture-Tiny"
PE = "0"
PV = "0.48"
PR = "23.el10"
PACKAGES = "perl-Capture-Tiny perl-Capture-Tiny-tests"


URI_perl-Capture-Tiny = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Capture-Tiny-0.48-23.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Capture-Tiny = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Exporter) ( ) perl(Carp) ( ) perl(File::Spec) ( ) perl(File::Temp) ( ) perl(IO::Handle) ( ) perl(Scalar::Util) ( ) perl(:VERSION) ( >=  5.6.0)"
RPROVIDES:perl-Capture-Tiny = "perl(Capture::Tiny) ( =  0.48) perl-Capture-Tiny ( =  0.48-23.el10)"

URI_perl-Capture-Tiny-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Capture-Tiny-tests-0.48-23.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Capture-Tiny-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(File::Spec) ( ) perl(lib) ( ) perl(Config) ( ) perl(Exporter) ( ) perl(Carp) ( ) perl(File::Temp) ( ) perl(IO::Handle) ( ) perl(ExtUtils::MakeMaker) ( ) perl(IO::File) ( ) perl(Capture::Tiny) ( ) perl(PerlIO::scalar) ( ) perl-Capture-Tiny ( =  0.48-23.el10) perl(Test::More) ( >=  0.62)"
RPROVIDES:perl-Capture-Tiny-tests = "perl-Capture-Tiny-tests ( =  0.48-23.el10)"
