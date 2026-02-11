
PN = "perl-YAML-Tiny"
PE = "0"
PV = "1.74"
PR = "8.el10"
PACKAGES = "perl-YAML-Tiny perl-YAML-Tiny-tests"


URI_perl-YAML-Tiny = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-YAML-Tiny-1.74-8.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-YAML-Tiny = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Exporter) ( ) perl(Carp) ( ) perl(Config) ( ) perl(Fcntl) ( ) perl(Scalar::Util) ( ) perl(B) ( ) perl(:VERSION) ( >=  5.8.1)"
RPROVIDES:perl-YAML-Tiny = "perl(YAML::Tiny) ( =  1.74) perl-YAML-Tiny ( =  1.74-8.el10)"

URI_perl-YAML-Tiny-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-YAML-Tiny-tests-1.74-8.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-YAML-Tiny-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(File::Spec) ( ) perl(lib) ( ) perl(Exporter) ( ) perl(Carp) ( ) perl(vars) ( ) perl(base) ( ) perl(utf8) ( ) perl(ExtUtils::MakeMaker) ( ) perl(File::Basename) ( ) perl(File::Spec::Functions) ( ) perl(Getopt::Long) ( ) perl(File::Find) ( ) perl(List::Util) ( ) perl(open) ( ) perl(IO::Dir) ( ) perl(YAML::Tiny) ( ) perl(Test::More) ( >=  0.88) perl(:VERSION) ( >=  5.8.1) perl(File::Temp) ( >=  0.19) perl-YAML-Tiny ( =  1.74-8.el10)"
RPROVIDES:perl-YAML-Tiny-tests = "perl-YAML-Tiny-tests ( =  1.74-8.el10)"
