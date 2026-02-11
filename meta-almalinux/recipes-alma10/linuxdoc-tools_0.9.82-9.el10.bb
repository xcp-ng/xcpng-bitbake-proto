
PN = "linuxdoc-tools"
PE = "0"
PV = "0.9.82"
PR = "9.el10"
PACKAGES = "linuxdoc-tools"


URI_linuxdoc-tools = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/linuxdoc-tools-0.9.82-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:linuxdoc-tools = "/bin/sh ( ) /usr/bin/texconfig-sys ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) perl(strict) ( ) perl-libs ( ) perl(Exporter) ( ) /usr/bin/perl ( ) perl(vars) ( ) perl(File::Basename) ( ) perl(base) ( ) perl(Cwd) ( ) perl(File::Temp) ( ) perl(File::Copy) ( ) perl(lib) ( ) perl(FileHandle) ( ) gawk ( ) perl(subs) ( ) tex(latex) ( ) jade ( ) perl(LinuxDocTools::Vars) ( ) groff ( ) perl(DirHandle) ( ) perl(:VERSION) ( >=  5.6.0)"
RPROVIDES:linuxdoc-tools = "perl(LinuxDocTools) ( ) perl(LinuxDocTools::BackEnd) ( ) perl(LinuxDocTools::Data::Latin1ToSgml) ( ) perl(LinuxDocTools::Data::Strings_SBCS) ( ) perl(LinuxDocTools::Data::Strings_UTF8) ( ) perl(LinuxDocTools::FixRef) ( ) perl(LinuxDocTools::Html2Html) ( ) perl(LinuxDocTools::InfoUtils) ( ) perl(LinuxDocTools::Lang) ( ) perl(LinuxDocTools::Utils) ( ) perl(Text::EntityMap) ( ) perl(Text::EntityMapGroup) ( ) linuxdoc-sgml ( =  0.9.82-9.el10) linuxdoc-tools ( =  0.9.82-9.el10) linuxdoc-tools(x86-64) ( =  0.9.82-9.el10) perl(LinuxDocTools::CharEnts) ( =  1.1.1.1) perl(LinuxDocTools::Vars) ( =  1.1.1.1) sgml-tools ( =  0.9.82-9.el10)"
