
PN = "perl-Text-Tabs+Wrap"
PE = "0"
PV = "2024.001"
PR = "511.el10"
PACKAGES = "perl-Text-Tabs+Wrap perl-Text-Tabs+Wrap-tests"


URI_perl-Text-Tabs+Wrap = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Text-Tabs+Wrap-2024.001-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Text-Tabs+Wrap = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Exporter) ( ) perl(warnings::register) ( ) perl(re) ( ) perl(Text::Tabs) ( )"
RPROVIDES:perl-Text-Tabs+Wrap = "perl(Text::Tabs) ( =  2024.001) perl(Text::Wrap) ( =  2024.001) perl-Text-Tabs+Wrap ( =  2024.001-511.el10)"

URI_perl-Text-Tabs+Wrap-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Text-Tabs+Wrap-tests-2024.001-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Text-Tabs+Wrap-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(bytes) ( ) perl(Text::Wrap) ( ) perl(Text::Tabs) ( ) perl-Text-Tabs+Wrap ( =  2024.001-511.el10)"
RPROVIDES:perl-Text-Tabs+Wrap-tests = "perl-Text-Tabs+Wrap-tests ( =  2024.001-511.el10)"
