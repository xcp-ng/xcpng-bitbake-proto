
PN = "perl-File-HomeDir"
PE = "0"
PV = "1.006"
PR = "15.el10"
PACKAGES = "perl-File-HomeDir perl-File-HomeDir-tests"


URI_perl-File-HomeDir = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-File-HomeDir-1.006-15.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-File-HomeDir = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Carp) ( ) perl(Exporter) ( ) perl(vars) ( ) perl(Config) ( ) perl(base) ( ) perl(File::HomeDir::Darwin) ( ) perl(File::HomeDir::Driver) ( ) perl(File::HomeDir::Unix) ( ) perl(:VERSION) ( >=  5.8.3) perl(Cwd) ( >=  3.12) perl(File::Path) ( >=  2.01) perl(File::Spec) ( >=  3.12) perl(File::Temp) ( >=  0.19) perl(File::Which) ( >=  0.05)"
RPROVIDES:perl-File-HomeDir = "perl(File::HomeDir) ( =  1.006) perl(File::HomeDir::Darwin) ( =  1.006) perl(File::HomeDir::Darwin::Carbon) ( =  1.006) perl(File::HomeDir::Darwin::Cocoa) ( =  1.006) perl(File::HomeDir::Driver) ( =  1.006) perl(File::HomeDir::FreeDesktop) ( =  1.006) perl(File::HomeDir::MacOS9) ( =  1.006) perl(File::HomeDir::Test) ( =  1.006) perl(File::HomeDir::Unix) ( =  1.006) perl(File::HomeDir::Windows) ( =  1.006) perl-File-HomeDir ( =  1.006-15.el10)"

URI_perl-File-HomeDir-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-File-HomeDir-tests-1.006-15.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-File-HomeDir-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(File::Spec::Functions) ( ) perl(File::HomeDir) ( ) perl(File::HomeDir::Test) ( ) perl-File-HomeDir ( =  1.006-15.el10)"
RPROVIDES:perl-File-HomeDir-tests = "perl-File-HomeDir-tests ( =  1.006-15.el10)"
