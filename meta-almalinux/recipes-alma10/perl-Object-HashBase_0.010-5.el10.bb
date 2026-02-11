
PN = "perl-Object-HashBase"
PE = "0"
PV = "0.010"
PR = "5.el10"
PACKAGES = "perl-Object-HashBase perl-Object-HashBase-tests perl-Object-HashBase-tools"


URI_perl-Object-HashBase = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Object-HashBase-0.010-5.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Object-HashBase = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Carp) ( )"
RPROVIDES:perl-Object-HashBase = "perl(Object::HashBase) ( =  0.010) perl-Object-HashBase ( =  0.010-5.el10)"

URI_perl-Object-HashBase-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Object-HashBase-tests-0.010-5.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Object-HashBase-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(File::Temp) ( ) perl(Object::HashBase::Inline) ( ) perl(Object::HashBase::Test) ( ) perl(Object::HashBase) ( ) perl-Object-HashBase ( =  0.010-5.el10)"
RPROVIDES:perl-Object-HashBase-tests = "perl-Object-HashBase-tests ( =  0.010-5.el10)"

URI_perl-Object-HashBase-tools = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Object-HashBase-tools-0.010-5.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Object-HashBase-tools = "perl(strict) ( ) /usr/bin/perl ( ) perl(warnings) ( ) perl(vars) ( ) perl-libs ( ) perl(base) ( ) perl(Object::HashBase::Inline) ( ) perl(Object::HashBase::Test) ( ) perl(Object::HashBase) ( ) perl-Object-HashBase ( =  0.010-5.el10) perl(Test::More) ( >=  0.98)"
RPROVIDES:perl-Object-HashBase-tools = "perl(Object::HashBase::Inline) ( =  0.010) perl(Object::HashBase::Test) ( =  0.010) perl-Object-HashBase-tools ( =  0.010-5.el10)"
