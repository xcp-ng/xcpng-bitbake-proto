
PN = "perl-CPAN-Meta-YAML"
PE = "0"
PV = "0.018"
PR = "512.el10"
PACKAGES = "perl-CPAN-Meta-YAML perl-CPAN-Meta-YAML-tests"


URI_perl-CPAN-Meta-YAML = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-CPAN-Meta-YAML-0.018-512.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-CPAN-Meta-YAML = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Carp) ( ) perl(Exporter) ( ) perl(Fcntl) ( ) perl(Scalar::Util) ( ) perl(B) ( ) perl(:VERSION) ( >=  5.8.1)"
RPROVIDES:perl-CPAN-Meta-YAML = "perl(CPAN::Meta::YAML) ( =  0.018) perl-CPAN-Meta-YAML ( =  0.018-512.el10)"

URI_perl-CPAN-Meta-YAML-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-CPAN-Meta-YAML-tests-0.018-512.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-CPAN-Meta-YAML-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(File::Spec) ( ) perl(lib) ( ) perl(Exporter) ( ) perl(Carp) ( ) perl(vars) ( ) perl(base) ( ) perl(utf8) ( ) perl(ExtUtils::MakeMaker) ( ) perl(File::Basename) ( ) perl(File::Spec::Functions) ( ) perl(Getopt::Long) ( ) perl(File::Find) ( ) perl(List::Util) ( ) perl(IO::Dir) ( ) perl(CPAN::Meta::YAML) ( ) perl(Test::More) ( >=  0.88) perl(:VERSION) ( >=  5.8.1) perl(File::Temp) ( >=  0.19) perl-CPAN-Meta-YAML ( =  0.018-512.el10)"
RPROVIDES:perl-CPAN-Meta-YAML-tests = "perl-CPAN-Meta-YAML-tests ( =  0.018-512.el10)"
