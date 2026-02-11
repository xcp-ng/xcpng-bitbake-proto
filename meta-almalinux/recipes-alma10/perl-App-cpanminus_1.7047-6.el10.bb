
PN = "perl-App-cpanminus"
PE = "0"
PV = "1.7047"
PR = "6.el10"
PACKAGES = "perl-App-cpanminus perl-App-cpanminus-tests"


URI_perl-App-cpanminus = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-App-cpanminus-1.7047-6.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-App-cpanminus = "perl(strict) ( ) perl-libs ( ) perl ( ) /usr/bin/perl ( ) perl(constant) ( ) perl(File::Spec) ( ) perl(Config) ( ) perl(File::Basename) ( ) perl(Getopt::Long) ( ) perl(Cwd) ( ) perl(File::Path) ( ) perl(File::Temp) ( ) perl(Symbol) ( ) perl(File::Find) ( ) perl(File::Copy) ( ) perl(version) ( ) perl(Digest::SHA) ( ) perl(CPAN::Meta) ( ) perl(ExtUtils::Manifest) ( ) perl(CPAN::Meta::Requirements) ( ) perl(HTTP::Tiny) ( ) perl(Module::CoreList) ( ) perl(Module::Metadata) ( ) perl(Safe) ( ) perl(CPAN::DistnameInfo) ( ) perl(CPAN::Meta::YAML) ( ) perl(Module::CPANfile) ( ) perl(String::ShellQuote) ( ) perl(local::lib) ( ) perl(App::cpanminus) ( ) perl(File::pushd) ( ) perl(Parse::PMFile) ( ) perl(YAML) ( ) perl(CPAN::Meta::Check) ( >=  0.018) perl(ExtUtils::Install) ( >=  1.46) perl(ExtUtils::MakeMaker) ( >=  6.58) perl(Module::Build) ( >=  0.38)"
RPROVIDES:perl-App-cpanminus = "perl(App::cpanminus::Dependency) ( ) perl(App::cpanminus::fatscript) ( ) perl(App::cpanminus::script) ( ) cpanminus ( =  1.7047-6.el10) perl(App::cpanminus) ( =  1.7047) perl-App-cpanminus ( =  1.7047-6.el10)"

URI_perl-App-cpanminus-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-App-cpanminus-tests-1.7047-6.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-App-cpanminus-tests = "perl(strict) ( ) /usr/bin/perl ( ) perl-Test-Harness ( ) perl(Test::More) ( ) /usr/bin/bash ( ) perl-App-cpanminus ( =  1.7047-6.el10)"
RPROVIDES:perl-App-cpanminus-tests = "perl-App-cpanminus-tests ( =  1.7047-6.el10)"
