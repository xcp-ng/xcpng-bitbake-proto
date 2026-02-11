
PN = "perl-YAML"
PE = "0"
PV = "1.31"
PR = "7.el10"
PACKAGES = "perl-YAML perl-YAML-tests"


URI_perl-YAML = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-YAML-1.31-7.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-YAML = "perl(strict) ( ) perl-libs ( ) perl(Carp) ( ) perl(Exporter) ( ) perl(constant) ( ) perl(overload) ( ) perl(Scalar::Util) ( ) perl(B) ( ) perl(B::Deparse) ( )"
RPROVIDES:perl-YAML = "perl(YAML::Dumper) ( ) perl(YAML::Dumper::Base) ( ) perl(YAML::Error) ( ) perl(YAML::Loader) ( ) perl(YAML::Loader::Base) ( ) perl(YAML::Marshall) ( ) perl(YAML::Mo) ( ) perl(YAML::Node) ( ) perl(YAML::Tag) ( ) perl(YAML::Type::blessed) ( ) perl(YAML::Type::code) ( ) perl(YAML::Type::glob) ( ) perl(YAML::Type::ref) ( ) perl(YAML::Type::regexp) ( ) perl(YAML::Type::undef) ( ) perl(YAML::Types) ( ) perl(YAML::Warning) ( ) perl(YAML) ( =  1.31) perl(YAML::Any) ( =  1.31) perl-YAML ( =  1.31-7.el10)"

URI_perl-YAML-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-YAML-tests-1.31-7.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-YAML-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(Config) ( ) perl(constant) ( ) perl(B) ( ) perl(Test::Deep) ( ) perl(YAML) ( ) perl-YAML ( =  1.31-7.el10)"
RPROVIDES:perl-YAML-tests = "perl-YAML-tests ( =  1.31-7.el10)"
