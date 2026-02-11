
PN = "perl-Data-Section"
PE = "0"
PV = "0.200008"
PR = "8.el10"
PACKAGES = "perl-Data-Section perl-Data-Section-tests"


URI_perl-Data-Section = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Data-Section-0.200008-8.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Data-Section = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Encode) ( ) perl(MRO::Compat) ( >=  0.09) perl(Sub::Exporter) ( >=  0.979)"
RPROVIDES:perl-Data-Section = "perl(Data::Section) ( =  0.200008) perl-Data-Section ( =  0.200008-8.el10)"

URI_perl-Data-Section-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Data-Section-tests-0.200008-8.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Data-Section-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(File::Spec) ( ) perl(lib) ( ) perl(base) ( ) perl(utf8) ( ) perl(ExtUtils::MakeMaker) ( ) perl(Encode) ( ) perl(Test::FailWarnings) ( ) perl(Data::Section) ( ) perl-Data-Section ( =  0.200008-8.el10)"
RPROVIDES:perl-Data-Section-tests = "perl-Data-Section-tests ( =  0.200008-8.el10)"
