
PN = "perl-Module-Metadata"
PE = "0"
PV = "1.000038"
PR = "512.el10"
PACKAGES = "perl-Module-Metadata perl-Module-Metadata-tests"


URI_perl-Module-Metadata = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Module-Metadata-1.000038-512.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Module-Metadata = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Carp) ( ) perl(File::Spec) ( ) perl(Fcntl) ( ) perl(Encode) ( ) perl(File::Find) ( ) perl(version) ( >=  0.87)"
RPROVIDES:perl-Module-Metadata = "perl(Module::Metadata) ( =  1.000038) perl-Module-Metadata ( =  1.000038-512.el10)"

URI_perl-Module-Metadata-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Module-Metadata-tests-1.000038-512.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Module-Metadata-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(File::Spec) ( ) perl(lib) ( ) perl(Config) ( ) perl(Carp) ( ) perl(File::Temp) ( ) perl(Cwd) ( ) perl(File::Path) ( ) perl(File::Basename) ( ) perl(Encode) ( ) perl(IO::File) ( ) perl(Module::Metadata) ( ) perl(Test::More) ( >=  0.88) perl-Module-Metadata ( =  1.000038-512.el10) perl(Test::More) ( >=  0.82)"
RPROVIDES:perl-Module-Metadata-tests = "perl-Module-Metadata-tests ( =  1.000038-512.el10)"
