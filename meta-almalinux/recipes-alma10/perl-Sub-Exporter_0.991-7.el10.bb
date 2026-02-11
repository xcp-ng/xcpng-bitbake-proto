
PN = "perl-Sub-Exporter"
PE = "0"
PV = "0.991"
PR = "7.el10"
PACKAGES = "perl-Sub-Exporter perl-Sub-Exporter-tests"


URI_perl-Sub-Exporter = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Sub-Exporter-0.991-7.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Sub-Exporter = "perl-libs ( ) perl(warnings) ( ) perl(Carp) ( ) perl(Sub::Exporter) ( ) perl(Package::Generator) ( ) perl(:VERSION) ( >=  5.12.0) perl(Data::OptList) ( >=  0.100) perl(Params::Util) ( >=  0.14) perl(Sub::Install) ( >=  0.92)"
RPROVIDES:perl-Sub-Exporter = "perl(Sub::Exporter) ( =  0.991) perl(Sub::Exporter::Util) ( =  0.991) perl-Sub-Exporter ( =  0.991-7.el10)"

URI_perl-Sub-Exporter-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Sub-Exporter-tests-0.991-7.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Sub-Exporter-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(File::Spec) ( ) perl(lib) ( ) perl(Exporter) ( ) perl(Carp) ( ) perl(base) ( ) perl(overload) ( ) perl(ExtUtils::MakeMaker) ( ) perl(subs) ( ) perl(Data::OptList) ( ) perl(Sub::Exporter) ( ) perl-Sub-Exporter ( =  0.991-7.el10)"
RPROVIDES:perl-Sub-Exporter-tests = "perl-Sub-Exporter-tests ( =  0.991-7.el10)"
