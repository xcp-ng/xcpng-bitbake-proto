
PN = "perl-Archive-Zip"
PE = "0"
PV = "1.68"
PR = "17.el10"
PACKAGES = "perl-Archive-Zip perl-Archive-Zip-tests"


URI_perl-Archive-Zip = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Archive-Zip-1.68-17.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Archive-Zip = "perl(strict) ( ) perl-libs ( ) perl(Carp) ( ) perl(Exporter) ( ) /usr/bin/perl ( ) perl(vars) ( ) perl(constant) ( ) perl(File::Basename) ( ) perl(Cwd) ( ) perl(Encode) ( ) perl(lib) ( ) perl(File::Path) ( ) perl(File::Temp) ( ) perl(IO::File) ( ) perl(File::Find) ( ) perl(integer) ( ) perl(File::Copy) ( ) perl(Time::Local) ( ) perl(FileHandle) ( ) perl(Compress::Raw::Zlib) ( ) perl(IO::Seekable) ( ) perl(Archive::Zip) ( ) perl(Archive::Zip::Archive) ( ) perl(Archive::Zip::DirectoryMember) ( ) perl(Archive::Zip::FileMember) ( ) perl(Archive::Zip::Member) ( ) perl(Archive::Zip::NewFileMember) ( ) perl(Archive::Zip::StringMember) ( ) perl(Archive::Zip::ZipFileMember) ( ) perl(:VERSION) ( >=  5.6.0) perl(File::Spec) ( >=  0.80)"
RPROVIDES:perl-Archive-Zip = "perl(Archive::Zip) ( =  1.68) perl(Archive::Zip::Archive) ( =  1.68) perl(Archive::Zip::BufferedFileHandle) ( =  1.68) perl(Archive::Zip::DirectoryMember) ( =  1.68) perl(Archive::Zip::FileMember) ( =  1.68) perl(Archive::Zip::Member) ( =  1.68) perl(Archive::Zip::MemberRead) ( =  1.68) perl(Archive::Zip::MockFileHandle) ( =  1.68) perl(Archive::Zip::NewFileMember) ( =  1.68) perl(Archive::Zip::StringMember) ( =  1.68) perl(Archive::Zip::Tree) ( =  1.68) perl(Archive::Zip::ZipFileMember) ( =  1.68) perl-Archive-Zip ( =  1.68-17.el10)"

URI_perl-Archive-Zip-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Archive-Zip-tests-1.68-17.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Archive-Zip-tests = "perl(strict) ( ) /usr/bin/perl ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) /usr/bin/bash ( ) perl(lib) ( ) perl(Config) ( ) perl(Exporter) ( ) perl(Carp) ( ) perl(File::Temp) ( ) perl(utf8) ( ) perl(File::Path) ( ) perl(constant) ( ) perl(IO::File) ( ) perl(File::Find) ( ) perl(File::Spec::Unix) ( ) unzip ( ) perl(IO::Compress::Zip) ( ) perl(Archive::Zip) ( ) perl(Archive::Zip::MemberRead) ( ) zip ( ) perl-Archive-Zip ( =  1.68-17.el10)"
RPROVIDES:perl-Archive-Zip-tests = "perl-Archive-Zip-tests ( =  1.68-17.el10)"
