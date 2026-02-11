
PN = "perl-File-ShareDir"
PE = "0"
PV = "1.118"
PR = "14.el10"
PACKAGES = "perl-File-ShareDir perl-File-ShareDir-tests"


URI_perl-File-ShareDir = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-File-ShareDir-1.118-14.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-File-ShareDir = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Carp) ( ) perl(Exporter) ( ) perl(constant) ( ) perl(File::Spec) ( ) perl(base) ( ) perl(:VERSION) ( >=  5.5.0) perl(Class::Inspector) ( >=  1.12)"
RPROVIDES:perl-File-ShareDir = "perl(File::ShareDir) ( =  1.118) perl-File-ShareDir ( =  1.118-14.el10)"

URI_perl-File-ShareDir-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-File-ShareDir-tests-1.118-14.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-File-ShareDir-tests = "perl(strict) ( ) /usr/bin/perl ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) /usr/bin/bash ( ) perl(File::Spec) ( ) perl(Cwd) ( ) perl(File::Path) ( ) perl(File::Basename) ( ) perl(POSIX) ( ) perl(parent) ( ) perl(File::ShareDir) ( ) perl-File-ShareDir ( =  1.118-14.el10)"
RPROVIDES:perl-File-ShareDir-tests = "perl-File-ShareDir-tests ( =  1.118-14.el10)"
