
PN = "perl-Module-Load-Conditional"
PE = "0"
PV = "0.74"
PR = "511.el10"
PACKAGES = "perl-Module-Load-Conditional perl-Module-Load-Conditional-tests"


URI_perl-Module-Load-Conditional = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Module-Load-Conditional-0.74-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Module-Load-Conditional = "perl(strict) ( ) perl-libs ( ) perl(Carp) ( ) perl(Exporter) ( ) perl(vars) ( ) perl(constant) ( ) perl(File::Spec) ( ) perl(Config) ( ) perl(FileHandle) ( ) perl(Locale::Maketext::Simple) ( ) perl(Params::Check) ( ) perl(Module::CoreList) ( >=  2.22) perl(Module::Load) ( >=  0.28) perl(Module::Metadata) ( >=  1.000005) perl(version) ( >=  0.69)"
RPROVIDES:perl-Module-Load-Conditional = "perl(Module::Load::Conditional) ( =  0.74) perl-Module-Load-Conditional ( =  0.74-511.el10)"

URI_perl-Module-Load-Conditional-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Module-Load-Conditional-tests-0.74-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Module-Load-Conditional-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(File::Spec) ( ) perl(lib) ( ) perl(Exporter) ( ) perl(constant) ( ) perl(FindBin) ( ) perl-Module-Load-Conditional ( =  0.74-511.el10)"
RPROVIDES:perl-Module-Load-Conditional-tests = "perl-Module-Load-Conditional-tests ( =  0.74-511.el10)"
