
PN = "perl-File-MimeInfo"
PE = "0"
PV = "0.34"
PR = "5.el10"
PACKAGES = "perl-File-MimeInfo perl-File-MimeInfo-tests"


URI_perl-File-MimeInfo = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-File-MimeInfo-0.34-5.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-File-MimeInfo = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Exporter) ( ) perl(Carp) ( ) /usr/bin/perl ( ) perl(File::Spec) ( ) perl(Fcntl) ( ) perl(Encode) ( ) perl(File::MimeInfo) ( ) perl(bytes) ( ) perl(Encode::Locale) ( ) perl(File::BaseDir) ( >=  0.03) perl(File::DesktopEntry) ( >=  0.04)"
RPROVIDES:perl-File-MimeInfo = "perl(File::MimeInfo) ( =  0.34) perl(File::MimeInfo::Applications) ( =  0.34) perl(File::MimeInfo::Magic) ( =  0.34) perl(File::MimeInfo::Rox) ( =  0.34) perl-File-MimeInfo ( =  0.34-5.el10)"

URI_perl-File-MimeInfo-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-File-MimeInfo-tests-0.34-5.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-File-MimeInfo-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(File::Spec) ( ) desktop-file-utils ( ) perl(File::MimeInfo) ( ) shared-mime-info ( ) perl(Test::More) ( >=  0.88) perl-File-MimeInfo ( =  0.34-5.el10)"
RPROVIDES:perl-File-MimeInfo-tests = "perl-File-MimeInfo-tests ( =  0.34-5.el10)"
