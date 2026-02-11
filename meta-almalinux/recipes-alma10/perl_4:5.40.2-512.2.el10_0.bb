
inherit dnf-bridge

PN = "perl"
PE = "4"
PV = "5.40.2"
PR = "512.2.el10_0"
PACKAGES = "perl-AutoLoader perl-Class-Struct perl-File-Basename perl-File-stat perl-FileHandle perl-Getopt-Std perl-IPC-Open3 perl-SelectSaver perl-Symbol perl-base perl-if perl-locale perl-overload perl-overloading perl-vars perl perl-Attribute-Handlers perl-AutoLoader perl-AutoSplit perl-B perl-Benchmark perl-Class-Struct perl-Config-Extensions perl-DBM_Filter perl-Devel-Peek perl-Devel-SelfStubber perl-DirHandle perl-Dumpvalue perl-DynaLoader perl-English perl-Errno perl-ExtUtils-Constant perl-ExtUtils-Embed perl-ExtUtils-Miniperl perl-Fcntl perl-File-Basename perl-File-Compare perl-File-Copy perl-File-DosGlob perl-File-Find perl-File-stat perl-FileCache perl-FileHandle perl-FindBin perl-GDBM_File perl-Getopt-Std perl-Hash-Util perl-Hash-Util-FieldHash perl-I18N-Collate perl-I18N-LangTags perl-I18N-Langinfo perl-IO perl-IPC-Open3 perl-Locale-Maketext-Simple perl-Math-Complex perl-Memoize perl-Module-Loaded perl-NDBM_File perl-NEXT perl-Net perl-ODBM_File perl-Opcode perl-POSIX perl-Pod-Functions perl-Pod-Html perl-Safe perl-Search-Dict perl-SelectSaver perl-SelfLoader perl-Symbol perl-Sys-Hostname perl-Term-Complete perl-Term-ReadLine perl-Test perl-Text-Abbrev perl-Thread perl-Thread-Semaphore perl-Tie perl-Tie-File perl-Tie-Memoize perl-Time perl-Time-Piece perl-Unicode-UCD perl-User-pwent perl-autouse perl-base perl-blib perl-debugger perl-deprecate perl-devel perl-diagnostics perl-doc perl-encoding-warnings perl-fields perl-filetest perl-if perl-interpreter perl-less perl-lib perl-libnetcfg perl-libs perl-locale perl-macros perl-meta-notation perl-mro perl-open perl-overload perl-overloading perl-ph perl-sigtrap perl-sort perl-subs perl-utils perl-vars perl-vmsish perl-tests"


URI_perl-AutoLoader = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/perl-AutoLoader-5.74-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-AutoLoader = " \
 perl-libs \
 perl-Carp \
"

URI_perl-Class-Struct = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/perl-Class-Struct-0.68-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-Class-Struct = " \
 perl-Exporter \
 perl-libs \
 perl-Carp \
"

URI_perl-File-Basename = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/perl-File-Basename-2.86-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-File-Basename = " \
 perl-Exporter \
 perl-libs \
 perl-Carp \
"

URI_perl-File-stat = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/perl-File-stat-1.14-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-File-stat = " \
 perl-constant \
 perl-libs \
 perl-Carp \
 perl-Class-Struct \
 perl-Fcntl \
 perl-Symbol \
 perl-overload \
 perl-Exporter \
"

URI_perl-FileHandle = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/perl-FileHandle-2.05-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-FileHandle = " \
 perl-Exporter \
 perl-libs \
 perl-IO \
"

URI_perl-Getopt-Std = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/perl-Getopt-Std-1.14-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-Getopt-Std = " \
 perl-Exporter \
 perl-libs \
"

URI_perl-IPC-Open3 = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/perl-IPC-Open3-1.22-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-IPC-Open3 = " \
 perl-constant \
 perl-libs \
 perl-Carp \
 perl-IO \
 perl-Fcntl \
 perl-POSIX \
 perl-Symbol \
 perl-IPC-Open3 \
 perl-Exporter \
"

URI_perl-SelectSaver = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/perl-SelectSaver-1.02-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-SelectSaver = " \
 perl-Symbol \
 perl-libs \
 perl-Carp \
"

URI_perl-Symbol = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/perl-Symbol-1.09-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-Symbol = " \
 perl-Exporter \
 perl-libs \
"

URI_perl-base = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/perl-base-2.27-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-base = " \
 perl-libs \
 perl-Carp \
"

URI_perl-if = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/perl-if-0.61.000-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-if = " \
 perl-libs \
"

URI_perl-locale = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/perl-locale-1.12-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-locale = " \
 perl-libs \
 perl-Carp \
 perl-POSIX \
"

URI_perl-overload = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/perl-overload-1.37-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-overload = " \
 perl-overloading \
 perl-Scalar-List-Utils \
 perl-libs \
 perl-mro \
"

URI_perl-overloading = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/perl-overloading-0.02-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-overloading = " \
 perl-libs \
 perl-Carp \
"

URI_perl-vars = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/perl-vars-1.05-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-vars = " \
 perl-libs \
 perl-Carp \
"

URI_perl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-5.40.2-512.2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl = " \
 perl-Safe \
 perl-Scalar-List-Utils \
 perl-Search-Dict \
 perl-SelectSaver \
 perl-SelfLoader \
 perl-Socket \
 perl-Storable \
 perl-Symbol \
 perl-Sys-Hostname \
 perl-Sys-Syslog \
 perl-Term-ANSIColor \
 perl-Term-Cap \
 perl-Term-Complete \
 perl-Term-ReadLine \
 perl-Term-Table \
 perl-Test \
 perl-Test-Harness \
 perl-Test-Simple \
 perl-Test2-Suite \
 perl-Text-Abbrev \
 perl-Text-Balanced \
 perl-Text-ParseWords \
 perl-Text-Tabs+Wrap \
 perl-Thread \
 perl-Thread-Queue \
 perl-Thread-Semaphore \
 perl-Tie \
 perl-Tie-File \
 perl-Tie-Memoize \
 perl-Tie-RefHash \
 perl-Time \
 perl-Time-HiRes \
 perl-Time-Local \
 perl-Time-Piece \
 perl-Unicode-Collate \
 perl-Unicode-Normalize \
 perl-Unicode-UCD \
 perl-User-pwent \
 perl-autodie \
 perl-autouse \
 perl-base \
 perl-bignum \
 perl-blib \
 perl-constant \
 perl-debugger \
 perl-deprecate \
 perl-devel \
 perl-diagnostics \
 perl-doc \
 perl-encoding \
 perl-encoding-warnings \
 perl-experimental \
 perl-fields \
 perl-filetest \
 perl-if \
 perl-interpreter \
 perl-less \
 perl-lib \
 perl-libnet \
 perl-libnetcfg \
 perl-libs \
 perl-locale \
 perl-macros \
 perl-meta-notation \
 perl-mro \
 perl-open \
 perl-overload \
 perl-overloading \
 perl-parent \
 perl-perlfaq \
 perl-ph \
 perl-podlators \
 perl-sigtrap \
 perl-sort \
 perl-subs \
 perl-threads \
 perl-threads-shared \
 perl-utils \
 perl-vars \
 perl-version \
 perl-vmsish \
 perl-Archive-Tar \
 perl-Attribute-Handlers \
 perl-AutoLoader \
 perl-AutoSplit \
 perl-B \
 perl-Benchmark \
 perl-CPAN \
 perl-CPAN-Meta \
 perl-CPAN-Meta-Requirements \
 perl-CPAN-Meta-YAML \
 perl-Carp \
 perl-Class-Struct \
 perl-Compress-Raw-Bzip2 \
 perl-Compress-Raw-Zlib \
 perl-Config-Extensions \
 perl-Config-Perl-V \
 perl-DBM_Filter \
 perl-Data-Dumper \
 perl-Devel-PPPort \
 perl-Devel-Peek \
 perl-Devel-SelfStubber \
 perl-Digest \
 perl-Digest-MD5 \
 perl-Digest-SHA \
 perl-DirHandle \
 perl-Dumpvalue \
 perl-DynaLoader \
 perl-Encode \
 perl-Encode-devel \
 perl-English \
 perl-Env \
 perl-Errno \
 perl-Exporter \
 perl-ExtUtils-CBuilder \
 perl-ExtUtils-Command \
 perl-ExtUtils-Constant \
 perl-ExtUtils-Embed \
 perl-ExtUtils-Install \
 perl-ExtUtils-MM-Utils \
 perl-ExtUtils-MakeMaker \
 perl-ExtUtils-Manifest \
 perl-ExtUtils-Miniperl \
 perl-ExtUtils-ParseXS \
 perl-Fcntl \
 perl-File-Basename \
 perl-File-Compare \
 perl-File-Copy \
 perl-File-DosGlob \
 perl-File-Fetch \
 perl-File-Find \
 perl-File-Path \
 perl-File-Temp \
 perl-File-stat \
 perl-FileCache \
 perl-FileHandle \
 perl-Filter \
 perl-Filter-Simple \
 perl-FindBin \
 perl-GDBM_File \
 perl-Getopt-Long \
 perl-Getopt-Std \
 perl-HTTP-Tiny \
 perl-Hash-Util \
 perl-Hash-Util-FieldHash \
 perl-I18N-Collate \
 perl-I18N-LangTags \
 perl-I18N-Langinfo \
 perl-IO \
 perl-IO-Compress \
 perl-IO-Socket-IP \
 perl-IO-Zlib \
 perl-IPC-Cmd \
 perl-IPC-Open3 \
 perl-IPC-SysV \
 perl-JSON-PP \
 perl-Locale-Maketext \
 perl-Locale-Maketext-Simple \
 perl-MIME-Base64 \
 perl-Math-BigInt \
 perl-Math-BigInt-FastCalc \
 perl-Math-Complex \
 perl-Memoize \
 perl-Module-CoreList \
 perl-Module-CoreList-tools \
 perl-Module-Load \
 perl-Module-Load-Conditional \
 perl-Module-Loaded \
 perl-Module-Metadata \
 perl-NDBM_File \
 perl-NEXT \
 perl-Net \
 perl-Net-Ping \
 perl-ODBM_File \
 perl-Opcode \
 perl-POSIX \
 perl-Params-Check \
 perl-PathTools \
 perl-Perl-OSType \
 perl-PerlIO-via-QuotedPrint \
 perl-Pod-Checker \
 perl-Pod-Escapes \
 perl-Pod-Functions \
 perl-Pod-Html \
 perl-Pod-Perldoc \
 perl-Pod-Simple \
 perl-Pod-Usage \
"

URI_perl-Attribute-Handlers = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Attribute-Handlers-1.03-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-Attribute-Handlers = " \
 perl-libs \
 perl-Carp \
"

URI_perl-AutoLoader = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-AutoLoader-5.74-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-AutoLoader = " \
 perl-libs \
 perl-Carp \
"

URI_perl-AutoSplit = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-AutoSplit-5.74-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-AutoSplit = " \
 perl-libs \
 perl-Carp \
 perl-File-Basename \
 perl-PathTools \
 perl-Exporter \
 perl-File-Path \
"

URI_perl-B = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-B-1.89-512.2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-B = " \
 perl-libs \
 perl-Carp \
 perl-B \
 perl-overloading \
 perl-if \
 glibc \
 perl-Exporter \
 perl-Data-Dumper \
"

URI_perl-Benchmark = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Benchmark-1.25-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-Benchmark = " \
 perl-Exporter \
 perl-libs \
 perl-Carp \
"

URI_perl-Class-Struct = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Class-Struct-0.68-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-Class-Struct = " \
 perl-Exporter \
 perl-libs \
 perl-Carp \
"

URI_perl-Config-Extensions = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Config-Extensions-0.03-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-Config-Extensions = " \
 perl-Exporter \
 perl-libs \
"

URI_perl-DBM_Filter = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-DBM_Filter-0.06-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-DBM_Filter = " \
 perl-IO-Compress \
 perl-Encode \
 perl-libs \
 perl-Carp \
"

URI_perl-Devel-Peek = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Devel-Peek-1.34-512.2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Devel-Peek = " \
 glibc \
 perl-Exporter \
 perl-libs \
"

URI_perl-Devel-SelfStubber = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Devel-SelfStubber-1.06-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-Devel-SelfStubber = " \
 perl-SelfLoader \
 perl-PathTools \
 perl-libs \
"

URI_perl-DirHandle = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-DirHandle-1.05-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-DirHandle = " \
 perl-Symbol \
 perl-libs \
 perl-Carp \
"

URI_perl-Dumpvalue = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Dumpvalue-2.27-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-Dumpvalue = " \
 perl-libs \
"

URI_perl-DynaLoader = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-DynaLoader-1.56-512.2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-DynaLoader = " \
 perl-vars \
 perl-libs \
 perl-Carp \
"

URI_perl-English = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-English-1.11-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-English = " \
 perl-Exporter \
 perl-libs \
 perl-Carp \
"

URI_perl-Errno = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Errno-1.38-512.2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Errno = " \
 perl-Exporter \
 perl-libs \
 perl-Carp \
"

URI_perl-ExtUtils-Constant = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-ExtUtils-Constant-0.25-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-ExtUtils-Constant = " \
 perl-constant \
 perl-libs \
 perl-Carp \
 perl-vars \
 perl-Text-Tabs+Wrap \
 perl-Exporter \
 perl-Data-Dumper \
 perl-ExtUtils-Constant \
"

URI_perl-ExtUtils-Embed = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-ExtUtils-Embed-1.35-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-ExtUtils-Embed = " \
 perl-Exporter \
 perl-PathTools \
 perl-libs \
 perl-devel \
"

URI_perl-ExtUtils-Miniperl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-ExtUtils-Miniperl-1.14-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-ExtUtils-Miniperl = " \
 perl-ExtUtils-Embed \
 perl-Exporter \
 perl-libs \
 perl-devel \
"

URI_perl-Fcntl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Fcntl-1.18-512.2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Fcntl = " \
 glibc \
 perl-Exporter \
 perl-libs \
"

URI_perl-File-Basename = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-File-Basename-2.86-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-File-Basename = " \
 perl-Exporter \
 perl-libs \
 perl-Carp \
"

URI_perl-File-Compare = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-File-Compare-1.100.800-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-File-Compare = " \
 perl-Exporter \
 perl-libs \
 perl-Carp \
"

URI_perl-File-Copy = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-File-Copy-2.41-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-File-Copy = " \
 perl-libs \
 perl-Carp \
 perl-File-Basename \
 perl-overload \
 perl-PathTools \
 perl-Exporter \
"

URI_perl-File-DosGlob = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-File-DosGlob-1.12-512.2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-File-DosGlob = " \
 glibc \
 perl-Text-ParseWords \
 perl-libs \
"

URI_perl-File-Find = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-File-Find-1.44-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-File-Find = " \
 perl-Exporter \
 perl-PathTools \
 perl-libs \
 perl-File-Basename \
"

URI_perl-File-stat = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-File-stat-1.14-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-File-stat = " \
 perl-constant \
 perl-libs \
 perl-Carp \
 perl-Class-Struct \
 perl-Fcntl \
 perl-overload \
 perl-Symbol \
 perl-Exporter \
"

URI_perl-FileCache = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-FileCache-1.10-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-FileCache = " \
 perl-Exporter \
 perl-libs \
 perl-parent \
 perl-Carp \
"

URI_perl-FileHandle = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-FileHandle-2.05-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-FileHandle = " \
 perl-Exporter \
 perl-libs \
 perl-IO \
"

URI_perl-FindBin = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-FindBin-1.54-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-FindBin = " \
 perl-libs \
 perl-Carp \
 perl-File-Basename \
 perl-PathTools \
 perl-Exporter \
"

URI_perl-GDBM_File = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-GDBM_File-1.24-512.2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-GDBM_File = " \
 perl-libs \
 perl-Carp \
 gdbm-libs \
 glibc \
 perl-Exporter \
"

URI_perl-Getopt-Std = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Getopt-Std-1.14-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-Getopt-Std = " \
 perl-Exporter \
 perl-libs \
"

URI_perl-Hash-Util = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Hash-Util-0.32-512.2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Hash-Util = " \
 perl-libs \
 perl-Carp \
 glibc \
 perl-Exporter \
 perl-Hash-Util-FieldHash \
"

URI_perl-Hash-Util-FieldHash = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Hash-Util-FieldHash-1.27-512.2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Hash-Util-FieldHash = " \
 glibc \
 perl-Exporter \
 perl-libs \
"

URI_perl-I18N-Collate = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-I18N-Collate-1.02-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-I18N-Collate = " \
 perl-Exporter \
 perl-overload \
 perl-libs \
 perl-POSIX \
"

URI_perl-I18N-LangTags = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-I18N-LangTags-0.45-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-I18N-LangTags = " \
 perl-Exporter \
 perl-I18N-LangTags \
 perl-libs \
"

URI_perl-I18N-Langinfo = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-I18N-Langinfo-0.24-512.2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-I18N-Langinfo = " \
 glibc \
 perl-Exporter \
 perl-libs \
 perl-Carp \
"

URI_perl-IO = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-IO-1.55-512.2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-IO = " \
 perl-File-stat \
 perl-libs \
 perl-Carp \
 perl-IO \
 perl-SelectSaver \
 perl-Socket \
 perl-Fcntl \
 perl-Symbol \
 perl-Errno \
 perl-PathTools \
 glibc \
 perl-Exporter \
"

URI_perl-IPC-Open3 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-IPC-Open3-1.22-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-IPC-Open3 = " \
 perl-constant \
 perl-libs \
 perl-Carp \
 perl-IO \
 perl-Fcntl \
 perl-POSIX \
 perl-Symbol \
 perl-IPC-Open3 \
 perl-Exporter \
"

URI_perl-Locale-Maketext-Simple = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Locale-Maketext-Simple-0.21-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-Locale-Maketext-Simple = " \
 perl-Locale-Maketext \
 perl-libs \
 perl-base \
"

URI_perl-Math-Complex = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Math-Complex-1.62-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-Math-Complex = " \
 perl-Scalar-List-Utils \
 perl-libs \
 perl-Math-Complex \
 perl-overload \
 perl-Exporter \
"

URI_perl-Memoize = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Memoize-1.16-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-Memoize = " \
 perl-Scalar-List-Utils \
 perl-libs \
 perl-Carp \
 perl-Storable \
 perl-NDBM_File \
 perl-Exporter \
"

URI_perl-Module-Loaded = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Module-Loaded-0.08-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-Module-Loaded = " \
 perl-libs \
 perl-Carp \
 perl-vars \
 perl-Exporter \
 perl-base \
"

URI_perl-NDBM_File = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-NDBM_File-1.17-512.2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-NDBM_File = " \
 glibc \
 perl-libs \
 gdbm-libs \
"

URI_perl-NEXT = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-NEXT-0.69-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-NEXT = " \
 perl-overload \
 perl-libs \
 perl-Carp \
"

URI_perl-Net = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Net-1.04-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-Net = " \
 perl-Class-Struct \
 perl-Exporter \
 perl-Socket \
 perl-libs \
"

URI_perl-ODBM_File = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-ODBM_File-1.18-512.2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-ODBM_File = " \
 glibc \
 perl-libs \
 gdbm-libs \
"

URI_perl-Opcode = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Opcode-1.65-512.2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Opcode = " \
 perl-subs \
 perl-libs \
 perl-Carp \
 perl-Opcode \
 glibc \
 perl-Exporter \
"

URI_perl-POSIX = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-POSIX-2.20-512.2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-POSIX = " \
 perl-libs \
 perl-Carp \
 perl-locale \
 perl-Fcntl \
 glibc \
 perl-Exporter \
"

URI_perl-Pod-Functions = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Pod-Functions-1.14-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-Pod-Functions = " \
 perl-Exporter \
 perl-libs \
"

URI_perl-Pod-Html = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Pod-Html-1.35-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-Pod-Html = " \
 perl-libs \
 perl-interpreter \
 perl-locale \
 perl-Text-Tabs+Wrap \
 perl-Getopt-Long \
 perl-File-Basename \
 perl-PathTools \
 perl-parent \
 perl-Exporter \
 perl-Pod-Html \
 perl-Pod-Simple \
"

URI_perl-Safe = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Safe-2.46-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-Safe = " \
 perl-Scalar-List-Utils \
 perl-libs \
 perl-Opcode \
 perl-Carp \
 perl-B \
"

URI_perl-Search-Dict = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Search-Dict-1.07-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-Search-Dict = " \
 perl-Exporter \
 perl-libs \
"

URI_perl-SelectSaver = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-SelectSaver-1.02-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-SelectSaver = " \
 perl-Symbol \
 perl-libs \
 perl-Carp \
"

URI_perl-SelfLoader = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-SelfLoader-1.27-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-SelfLoader = " \
 perl-Exporter \
 perl-libs \
 perl-Carp \
 perl-IO \
"

URI_perl-Symbol = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Symbol-1.09-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-Symbol = " \
 perl-Exporter \
 perl-libs \
"

URI_perl-Sys-Hostname = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Sys-Hostname-1.25-512.2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Sys-Hostname = " \
 glibc \
 perl-Exporter \
 perl-libs \
 perl-Carp \
"

URI_perl-Term-Complete = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Term-Complete-1.403-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-Term-Complete = " \
 perl-Exporter \
 perl-libs \
"

URI_perl-Term-ReadLine = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Term-ReadLine-1.17-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-Term-ReadLine = " \
 perl-Term-Cap \
 perl-libs \
"

URI_perl-Test = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Test-1.31-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-Test = " \
 perl-File-Temp \
 perl-Exporter \
 perl-libs \
 perl-Carp \
"

URI_perl-Text-Abbrev = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Text-Abbrev-1.02-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-Text-Abbrev = " \
 perl-Exporter \
 perl-libs \
"

URI_perl-Thread = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Thread-3.05-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-Thread = " \
 perl-threads-shared \
 perl-threads \
 perl-Exporter \
 perl-libs \
"

URI_perl-Thread-Semaphore = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Thread-Semaphore-2.13-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-Thread-Semaphore = " \
 perl-threads-shared \
 perl-Scalar-List-Utils \
 perl-libs \
 perl-Carp \
"

URI_perl-Tie = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Tie-4.6-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-Tie = " \
 perl-Tie \
 perl-libs \
 perl-Carp \
"

URI_perl-Tie-File = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Tie-File-1.09-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-Tie-File = " \
 perl-constant \
 perl-libs \
 perl-Carp \
 perl-Fcntl \
 perl-POSIX \
"

URI_perl-Tie-Memoize = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Tie-Memoize-1.1-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-Tie-Memoize = " \
 perl-libs \
 perl-Carp \
"

URI_perl-Time = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Time-1.04-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-Time = " \
 perl-libs \
 perl-Class-Struct \
 perl-parent \
 perl-Exporter \
 perl-Time \
"

URI_perl-Time-Piece = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Time-Piece-1.3401-512.2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Time-Piece = " \
 perl-constant \
 perl-Time-Piece \
 perl-Scalar-List-Utils \
 perl-libs \
 perl-Carp \
 perl-overload \
 glibc \
 perl-Exporter \
 perl-Time-Local \
"

URI_perl-Unicode-UCD = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Unicode-UCD-0.78-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-Unicode-UCD = " \
 perl-libs \
 perl-Carp \
 perl-Unicode-Normalize \
 perl-Storable \
 perl-PathTools \
 perl-if \
 perl-Exporter \
"

URI_perl-User-pwent = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-User-pwent-1.05-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-User-pwent = " \
 perl-Class-Struct \
 perl-Exporter \
 perl-libs \
 perl-Carp \
"

URI_perl-autouse = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-autouse-1.11-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-autouse = " \
 perl-libs \
 perl-Carp \
"

URI_perl-base = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-base-2.27-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-base = " \
 perl-libs \
 perl-Carp \
"

URI_perl-blib = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-blib-1.07-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-blib = " \
 perl-PathTools \
 perl-libs \
"

URI_perl-debugger = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-debugger-1.60-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-debugger = " \
 perl-threads \
 perl-threads-shared \
 perl-libs \
 perl-vars \
 perl-IO \
 perl-meta-notation \
 perl-mro \
 perl-PathTools \
 perl-Term-ReadLine \
"

URI_perl-deprecate = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-deprecate-0.04-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-deprecate = " \
 perl-libs \
 perl-Carp \
"

URI_perl-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-devel-5.40.2-512.2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-devel = " \
 perl-Devel-PPPort \
 perl-ExtUtils-Install \
 perl-libs \
 perl-vars \
 redhat-rpm-config \
 perl-ExtUtils-ParseXS \
 perl-Text-Tabs+Wrap \
 perl-Getopt-Long \
 perl-File-Compare \
 perl-PathTools \
 libxcrypt-devel \
 systemtap-sdt-devel \
 systemtap-sdt-dtrace \
 perl-interpreter \
 perl-File-Path \
 perl-ExtUtils-Constant \
"

URI_perl-diagnostics = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-diagnostics-1.40-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-diagnostics = " \
 perl-libs \
 perl-Carp \
 perl-Text-Tabs+Wrap \
 perl-Getopt-Std \
 perl-interpreter \
"

URI_perl-doc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-doc-5.40.2-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-doc = " \
 perl-libs \
"

URI_perl-encoding-warnings = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-encoding-warnings-0.14-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-encoding-warnings = " \
 perl-libs \
 perl-Carp \
"

URI_perl-fields = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-fields-2.27-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-fields = " \
 perl-Hash-Util \
 perl-libs \
 perl-base \
 perl-Carp \
"

URI_perl-filetest = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-filetest-1.03-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-filetest = " \
 perl-libs \
"

URI_perl-if = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-if-0.61.000-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-if = " \
 perl-libs \
"

URI_perl-interpreter = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-interpreter-5.40.2-512.2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-interpreter = " \
 glibc \
 perl-libs \
"

URI_perl-less = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-less-0.03-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-less = " \
 perl-libs \
"

URI_perl-lib = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-lib-0.65-512.2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-lib = " \
 perl-libs \
 perl-Carp \
"

URI_perl-libnetcfg = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-libnetcfg-5.40.2-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-libnetcfg = " \
 perl-libs \
 perl-ExtUtils-MakeMaker \
 perl-vars \
 perl-IO \
 perl-Getopt-Std \
 perl-PathTools \
 perl-interpreter \
"

URI_perl-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-libs-5.40.2-512.2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-libs = " \
 perl-libs \
 perl-Carp \
 libxcrypt \
 perl-DynaLoader \
 perl-Encode \
 perl-PathTools \
 glibc \
 perl-Exporter \
"

URI_perl-locale = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-locale-1.12-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-locale = " \
 perl-libs \
 perl-Carp \
 perl-POSIX \
"

URI_perl-macros = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-macros-5.40.2-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-macros = " \
 perl-interpreter \
"

URI_perl-meta-notation = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-meta-notation-5.40.2-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-meta-notation = " \
 perl-libs \
"

URI_perl-mro = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-mro-1.29-512.2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-mro = " \
 glibc \
 perl-libs \
"

URI_perl-open = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-open-1.13-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-open = " \
 perl-encoding \
 perl-Encode \
 perl-libs \
 perl-Carp \
"

URI_perl-overload = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-overload-1.37-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-overload = " \
 perl-overloading \
 perl-Scalar-List-Utils \
 perl-libs \
 perl-mro \
"

URI_perl-overloading = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-overloading-0.02-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-overloading = " \
 perl-libs \
 perl-Carp \
"

URI_perl-ph = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-ph-5.40.2-512.2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-ph = " \
 perl-libs \
"

URI_perl-sigtrap = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-sigtrap-1.10-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-sigtrap = " \
 perl-meta-notation \
 perl-Symbol \
 perl-libs \
 perl-Carp \
"

URI_perl-sort = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-sort-2.05-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-sort = " \
 perl-libs \
 perl-Carp \
"

URI_perl-subs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-subs-1.04-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-subs = " \
 perl-libs \
"

URI_perl-utils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-utils-5.40.2-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-utils = " \
 perl-libs \
 perl-vars \
 perl-File-Basename \
 perl-Getopt-Std \
 perl-PathTools \
 perl-interpreter \
 perl-File-Path \
"

URI_perl-vars = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-vars-1.05-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-vars = " \
 perl-libs \
 perl-Carp \
"

URI_perl-vmsish = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-vmsish-1.04-512.2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-vmsish = " \
 perl-libs \
"

URI_perl-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-tests-5.40.2-512.2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-tests = " \
 perl \
"
