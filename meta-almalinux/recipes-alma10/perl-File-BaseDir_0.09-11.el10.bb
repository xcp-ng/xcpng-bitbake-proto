
PN = "perl-File-BaseDir"
PE = "0"
PV = "0.09"
PR = "11.el10"
PACKAGES = "perl-File-BaseDir perl-File-BaseDir-tests perl-File-UserDirs"


URI_perl-File-BaseDir = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-File-BaseDir-0.09-11.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-File-BaseDir = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(File::Spec) ( ) perl(Config) ( ) perl(File::BaseDir) ( ) perl(Exporter) ( >=  5.57)"
RPROVIDES:perl-File-BaseDir = "perl(File::BaseDir) ( =  0.09) perl(File::IconTheme) ( =  0.09) perl-File-BaseDir ( =  0.09-11.el10)"

URI_perl-File-BaseDir-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-File-BaseDir-tests-0.09-11.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-File-BaseDir-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(File::Spec) ( ) perl(lib) ( ) perl(Config) ( ) perl(Exporter) ( ) perl(File::Temp) ( ) perl(File::Path) ( ) perl(File::Spec::Functions) ( ) perl(File::Which) ( ) perl(File::UserDirs) ( ) xdg-user-dirs ( ) perl(File::BaseDir) ( ) perl(File::IconTheme) ( ) perl-File-BaseDir ( =  0.09-11.el10)"
RPROVIDES:perl-File-BaseDir-tests = "perl-File-BaseDir-tests ( =  0.09-11.el10)"

URI_perl-File-UserDirs = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-File-UserDirs-0.09-11.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-File-UserDirs = "perl(strict) ( ) perl(warnings) ( ) perl-libs ( ) perl(IPC::System::Simple) ( ) xdg-user-dirs ( ) perl(Exporter) ( >=  5.57)"
RPROVIDES:perl-File-UserDirs = "perl(File::UserDirs) ( =  0.09) perl-File-UserDirs ( =  0.09-11.el10)"
