
PN = "perl-Archive-Tar"
PE = "0"
PV = "3.02"
PR = "512.el10"
PACKAGES = "perl-Archive-Tar perl-Archive-Tar-tests"


URI_perl-Archive-Tar = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Archive-Tar-3.02-512.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Archive-Tar = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Carp) ( ) perl(Exporter) ( ) /usr/bin/perl ( ) perl(vars) ( ) perl(constant) ( ) perl(File::Spec) ( ) perl(Config) ( ) perl(File::Basename) ( ) perl(Getopt::Long) ( ) perl(Cwd) ( ) perl(File::Path) ( ) perl(Data::Dumper) ( ) perl(IO::File) ( ) perl(IO::Handle) ( ) perl(Getopt::Std) ( ) perl(File::Find) ( ) perl(Pod::Usage) ( ) perl(File::Spec::Unix) ( ) perl(Archive::Tar) ( ) perl(Text::Diff) ( ) perl(Archive::Tar::Constant) ( ) perl(Archive::Tar::File) ( ) perl(IO::Compress::Xz) ( ) perl(IO::Uncompress::UnXz) ( ) perl(:VERSION) ( >=  5.5.0) perl(IO::Compress::Bzip2) ( >=  2.015) perl(IO::Uncompress::Bunzip2) ( >=  2.015) perl(IO::Zlib) ( >=  1.01)"
RPROVIDES:perl-Archive-Tar = "perl(Archive::Tar) ( =  3.02) perl(Archive::Tar::Constant) ( =  3.02) perl(Archive::Tar::File) ( =  3.02) perl-Archive-Tar ( =  3.02-512.el10)"

URI_perl-Archive-Tar-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Archive-Tar-tests-3.02-512.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Archive-Tar-tests = "perl(strict) ( ) /usr/bin/perl ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) /usr/bin/bash ( ) perl(File::Spec) ( ) perl(lib) ( ) perl(Config) ( ) perl(File::Temp) ( ) perl(Cwd) ( ) perl(Data::Dumper) ( ) perl(ExtUtils::MakeMaker) ( ) perl(File::Path) ( ) perl(File::Basename) ( ) perl(IO::File) ( ) perl(FindBin) ( ) perl(File::Copy) ( ) perl(File::Spec::Unix) ( ) perl(IPC::Cmd) ( ) perl(Archive::Tar) ( ) perl(Archive::Tar::Constant) ( ) perl(Archive::Tar::File) ( ) perl-Archive-Tar ( =  3.02-512.el10)"
RPROVIDES:perl-Archive-Tar-tests = "perl-Archive-Tar-tests ( =  3.02-512.el10)"
