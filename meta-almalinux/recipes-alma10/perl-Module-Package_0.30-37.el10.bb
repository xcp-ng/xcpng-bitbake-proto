
PN = "perl-Module-Package"
PE = "0"
PV = "0.30"
PR = "37.el10"
PACKAGES = "perl-Module-Package perl-Module-Package-tests"


URI_perl-Module-Package = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Module-Package-0.30-37.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Module-Package = "perl(strict) ( ) perl(vars) ( ) perl-libs ( ) perl(Data::Dumper) ( ) perl(utf8) ( ) perl(overload) ( ) perl(File::Path) ( ) perl(Module::Install::Base) ( ) perl(Module::Package) ( ) perl(:VERSION) ( >=  5.5.0) perl(:VERSION) ( >=  5.8.3) perl(Cwd) ( >=  0) perl(File::Find) ( >=  0) perl(IO::All) ( >=  0.41) perl(Module::Install) ( >=  1.01) perl(Module::Install::AuthorRequires) ( >=  0.02) perl(Module::Install::ManifestSkip) ( >=  0.19) perl(Moo) ( >=  0.009008)"
RPROVIDES:perl-Module-Package = "perl(Module::Package::Dist) ( ) perl(Module::Package::PM) ( ) perl(Module::Package::POD) ( ) perl(Module::Package::Plugin::basic) ( ) perl-Module-Package ( =  0.30-37.el10) perl(Module::Install::Package) ( =  0.30) perl(Module::Package) ( =  0.30) perl(Module::Package::Plugin) ( =  0.30) perl(inc::Module::Package) ( =  0.30)"

URI_perl-Module-Package-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Module-Package-tests-0.30-37.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Module-Package-tests = "/usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(Test::More) ( ) perl(Module::Package) ( ) perl-Module-Package ( =  0.30-37.el10)"
RPROVIDES:perl-Module-Package-tests = "perl-Module-Package-tests ( =  0.30-37.el10)"
