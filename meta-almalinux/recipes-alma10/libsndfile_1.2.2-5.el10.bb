
PN = "libsndfile"
PE = "0"
PV = "1.2.2"
PR = "5.el10"
PACKAGES = "libsndfile libsndfile-utils libsndfile-devel"


URI_libsndfile = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libsndfile-1.2.2-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsndfile = "
 libvorbis
 libogg
 lame-libs
 gsm
 flac-libs
 glibc
 opus
 mpg123-libs
"

URI_libsndfile-utils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libsndfile-utils-1.2.2-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsndfile-utils = "
 glibc
 alsa-lib
 libsndfile
"

URI_libsndfile-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libsndfile-devel-1.2.2-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsndfile-devel = "
 libogg-devel
 pkgconf-pkg-config
 mpg123-devel
 libvorbis-devel
 flac-devel
 opus-devel
 libsndfile
"
