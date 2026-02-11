
PN = "perl-Filter-Simple"
PE = "0"
PV = "0.96"
PR = "511.el10"
PACKAGES = "perl-Filter-Simple perl-Filter-Simple-tests"


URI_perl-Filter-Simple = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Filter-Simple-0.96-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Filter-Simple = "perl-libs ( ) perl(warnings) ( ) perl(Carp) ( ) perl(Filter::Util::Call) ( ) perl(Text::Balanced) ( >=  1.97)"
RPROVIDES:perl-Filter-Simple = "perl(Filter::Simple) ( =  0.96) perl-Filter-Simple ( =  0.96-511.el10)"

URI_perl-Filter-Simple-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Filter-Simple-tests-0.96-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Filter-Simple-tests = "/usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(Exporter) ( ) perl(parent) ( ) perl(Filter::Simple) ( ) perl-Filter-Simple ( =  0.96-511.el10)"
RPROVIDES:perl-Filter-Simple-tests = "perl-Filter-Simple-tests ( =  0.96-511.el10)"
