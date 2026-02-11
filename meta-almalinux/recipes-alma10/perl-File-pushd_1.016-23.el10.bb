
PN = "perl-File-pushd"
PE = "0"
PV = "1.016"
PR = "23.el10"
PACKAGES = "perl-File-pushd perl-File-pushd-tests"


URI_perl-File-pushd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-File-pushd-1.016-23.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-File-pushd = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Carp) ( ) perl(Exporter) ( ) perl(File::Spec) ( ) perl(overload) ( ) perl(Cwd) ( ) perl(File::Path) ( ) perl(File::Temp) ( )"
RPROVIDES:perl-File-pushd = "perl(File::pushd) ( =  1.016) perl-File-pushd ( =  1.016-23.el10)"

URI_perl-File-pushd-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-File-pushd-tests-1.016-23.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-File-pushd-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(File::Spec) ( ) perl(Config) ( ) perl(File::Temp) ( ) perl(Cwd) ( ) perl(ExtUtils::MakeMaker) ( ) perl(File::Path) ( ) perl(File::Basename) ( ) perl(File::Spec::Functions) ( ) perl(File::pushd) ( ) perl(Test::More) ( >=  0.96) perl-File-pushd ( =  1.016-23.el10)"
RPROVIDES:perl-File-pushd-tests = "perl-File-pushd-tests ( =  1.016-23.el10)"
