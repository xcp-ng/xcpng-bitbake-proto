
PN = "perl-ExtUtils-Install"
PE = "0"
PV = "2.22"
PR = "511.el10"
PACKAGES = "perl-ExtUtils-Install perl-ExtUtils-Install-tests"


URI_perl-ExtUtils-Install = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-ExtUtils-Install-2.22-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-ExtUtils-Install = "perl(strict) ( ) perl-libs ( ) perl(Carp) ( ) perl(Exporter) ( ) perl(File::Spec) ( ) perl(Config) ( ) perl(File::Basename) ( ) perl(Cwd) ( ) perl(File::Path) ( ) perl(Data::Dumper) ( ) perl(File::Find) ( ) perl(File::Copy) ( ) perl(ExtUtils::MakeMaker) ( ) perl(File::Compare) ( ) perl(ExtUtils::Packlist) ( ) perl(AutoSplit) ( )"
RPROVIDES:perl-ExtUtils-Install = "perl(ExtUtils::Install::Warn) ( ) perl(ExtUtils::Install) ( =  2.22) perl(ExtUtils::Installed) ( =  2.22) perl(ExtUtils::Packlist) ( =  2.22) perl-ExtUtils-Install ( =  2.22-511.el10)"

URI_perl-ExtUtils-Install-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-ExtUtils-Install-tests-2.22-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-ExtUtils-Install-tests = "perl(strict) ( ) /usr/bin/perl ( ) perl-Test-Harness ( ) perl(Test::More) ( ) /usr/bin/bash ( ) perl(File::Spec) ( ) perl(Config) ( ) perl(Exporter) ( ) perl(File::Temp) ( ) perl(Cwd) ( ) perl(ExtUtils::MakeMaker) ( ) perl(File::Path) ( ) perl(File::Basename) ( ) perl(File::Find) ( ) make ( ) perl(File::Compare) ( ) perl(ExtUtils::MM) ( ) perl(ExtUtils::Install) ( ) perl-ExtUtils-Install ( =  2.22-511.el10)"
RPROVIDES:perl-ExtUtils-Install-tests = "perl-ExtUtils-Install-tests ( =  2.22-511.el10)"
