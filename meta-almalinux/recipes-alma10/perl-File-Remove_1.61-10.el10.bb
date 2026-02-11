
PN = "perl-File-Remove"
PE = "0"
PV = "1.61"
PR = "10.el10"
PACKAGES = "perl-File-Remove perl-File-Remove-tests"


URI_perl-File-Remove = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-File-Remove-1.61-10.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-File-Remove = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(vars) ( ) perl(constant) ( ) perl(File::Path) ( ) perl(File::Glob) ( ) perl(:VERSION) ( >=  5.8.0) perl(Cwd) ( >=  3.29) perl(File::Spec) ( >=  3.29)"
RPROVIDES:perl-File-Remove = "perl(File::Remove) ( =  1.61) perl-File-Remove ( =  1.61-10.el10)"

URI_perl-File-Remove-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-File-Remove-tests-1.61-10.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-File-Remove-tests = "perl(strict) ( ) /usr/bin/perl ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) /usr/bin/bash ( ) perl(File::Spec) ( ) perl(Cwd) ( ) perl(IO::Handle) ( ) perl(File::Path) ( ) perl(File::Spec::Functions) ( ) perl(File::Copy) ( ) perl(IPC::Open3) ( ) perl(File::Remove) ( ) perl(:VERSION) ( >=  5.6.0) perl-File-Remove ( =  1.61-10.el10)"
RPROVIDES:perl-File-Remove-tests = "perl-File-Remove-tests ( =  1.61-10.el10)"
