
PN = "perl-File-DesktopEntry"
PE = "0"
PV = "0.22"
PR = "28.el10"
PACKAGES = "perl-File-DesktopEntry perl-File-DesktopEntry-tests"


URI_perl-File-DesktopEntry = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-File-DesktopEntry-0.22-28.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-File-DesktopEntry = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Carp) ( ) perl(vars) ( ) perl(File::Spec) ( ) perl(Cwd) ( ) perl(Encode) ( ) perl(File::Path) ( ) perl(URI::Escape) ( ) perl(File::BaseDir) ( >=  0.03)"
RPROVIDES:perl-File-DesktopEntry = "perl(File::DesktopEntry) ( =  0.22) perl-File-DesktopEntry ( =  0.22-28.el10)"

URI_perl-File-DesktopEntry-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-File-DesktopEntry-tests-0.22-28.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-File-DesktopEntry-tests = "perl(strict) ( ) /usr/bin/perl ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) /usr/bin/bash ( ) perl(utf8) ( ) perl(File::DesktopEntry) ( ) perl-File-DesktopEntry ( =  0.22-28.el10)"
RPROVIDES:perl-File-DesktopEntry-tests = "perl-File-DesktopEntry-tests ( =  0.22-28.el10)"
