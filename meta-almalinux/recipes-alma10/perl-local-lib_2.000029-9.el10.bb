
PN = "perl-local-lib"
PE = "0"
PV = "2.000029"
PR = "9.el10"
PACKAGES = "perl-local-lib perl-homedir perl-local-lib-tests"


URI_perl-local-lib = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-local-lib-2.000029-9.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-local-lib = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Carp) ( ) perl(File::Spec) ( ) perl(Config) ( ) perl(File::Basename) ( ) perl(File::Glob) ( ) perl(Carp::Heavy) ( ) perl(:VERSION) ( >=  5.6.0)"
RPROVIDES:perl-local-lib = "perl(lib::core::only) ( ) perl(local::lib) ( =  2.000029) perl-local-lib ( =  2.000029-9.el10)"

URI_perl-homedir = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-homedir-2.000029-9.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-homedir = "sed ( ) perl-local-lib ( =  2.000029-9.el10)"
RPROVIDES:perl-homedir = "perl-homedir ( =  2.000029-9.el10)"

URI_perl-local-lib-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-local-lib-tests-2.000029-9.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-local-lib-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(File::Spec) ( ) perl(lib) ( ) perl(Config) ( ) perl(Exporter) ( ) perl(Carp) ( ) perl(File::Temp) ( ) perl(base) ( ) perl(Cwd) ( ) perl(File::Path) ( ) perl(File::Basename) ( ) perl(File::Spec::Functions) ( ) perl(IPC::Open3) ( ) perl(lib::core::only) ( ) perl(local::lib) ( ) perl-local-lib ( =  2.000029-9.el10)"
RPROVIDES:perl-local-lib-tests = "perl-local-lib-tests ( =  2.000029-9.el10)"
