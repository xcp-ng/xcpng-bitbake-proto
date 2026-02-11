
PN = "perl-File-Path"
PE = "0"
PV = "2.18"
PR = "511.el10"
PACKAGES = "perl-File-Path perl-File-Path-tests"


URI_perl-File-Path = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-File-Path-2.18-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-File-Path = "perl(strict) ( ) perl-libs ( ) perl(Carp) ( ) perl(Exporter) ( ) perl(vars) ( ) perl(File::Spec) ( ) perl(File::Basename) ( ) perl(Cwd) ( ) perl(:VERSION) ( >=  5.5.0)"
RPROVIDES:perl-File-Path = "perl(File::Path) ( =  2.18) perl-File-Path ( =  2.18-511.el10)"

URI_perl-File-Path-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-File-Path-tests-2.18-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-File-Path-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(lib) ( ) perl(Config) ( ) perl(Exporter) ( ) perl(Carp) ( ) perl(base) ( ) perl(Cwd) ( ) perl(File::Path) ( ) perl(File::Spec::Functions) ( ) perl(Fcntl) ( ) perl(Symbol) ( ) perl(Errno) ( ) perl(SelectSaver) ( ) perl-File-Path ( =  2.18-511.el10)"
RPROVIDES:perl-File-Path-tests = "perl-File-Path-tests ( =  2.18-511.el10)"
