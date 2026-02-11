
PN = "perl-Role-Tiny"
PE = "0"
PV = "2.002004"
PR = "14.el10"
PACKAGES = "perl-Role-Tiny perl-Role-Tiny-tests"


URI_perl-Role-Tiny = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Role-Tiny-2.002004-14.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Role-Tiny = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Exporter) ( ) perl(Carp) ( ) perl(Role::Tiny) ( ) perl(mro) ( ) perl(Class::Method::Modifiers) ( >=  1.05)"
RPROVIDES:perl-Role-Tiny = "perl(Role::Tiny) ( =  2.002004) perl(Role::Tiny::With) ( =  2.002004) perl-Role-Tiny ( =  2.002004-14.el10)"

URI_perl-Role-Tiny-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Role-Tiny-tests-2.002004-14.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Role-Tiny-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(lib) ( ) perl(Exporter) ( ) perl(base) ( ) perl(overload) ( ) perl(constant) ( ) perl(B) ( ) perl(Role::Tiny) ( ) perl(Role::Tiny::With) ( ) perl-Role-Tiny ( =  2.002004-14.el10)"
RPROVIDES:perl-Role-Tiny-tests = "perl(BrokenModule) ( ) perl(ExistingModule) ( ) perl(FalseModule) ( ) perl(TrueModule) ( ) perl-Role-Tiny-tests ( =  2.002004-14.el10)"
