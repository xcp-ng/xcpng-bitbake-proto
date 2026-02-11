
PN = "golang-github-cpuguy83-md2man"
PE = "0"
PV = "2.0.3"
PR = "8.el10"
PACKAGES = "golang-github-cpuguy83-md2man compat-golang-github-cpuguy83-md2man-2-devel golang-github-cpuguy83-md2man-devel"


URI_golang-github-cpuguy83-md2man = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/golang-github-cpuguy83-md2man-2.0.3-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:golang-github-cpuguy83-md2man = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( )"
RPROVIDES:golang-github-cpuguy83-md2man = "bundled(golang(github.com/russross/blackfriday/v2)) ( =  2.1.0) go-md2man ( =  2.0.3-8.el10) golang-github-cpuguy83-md2man ( =  2.0.3-8.el10) golang-github-cpuguy83-md2man(x86-64) ( =  2.0.3-8.el10)"

URI_compat-golang-github-cpuguy83-md2man-2-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/compat-golang-github-cpuguy83-md2man-2-devel-2.0.3-8.el10.noarch.rpm;unpack=0"
RDEPENDS:compat-golang-github-cpuguy83-md2man-2-devel = "go-filesystem ( ) golang-ipath(github.com/cpuguy83/go-md2man) ( =  2.0.3-8.el10)"
RPROVIDES:compat-golang-github-cpuguy83-md2man-2-devel = "compat-golang-github-cpuguy83-md2man-2-devel ( =  2.0.3-8.el10) golang(github.com/cpuguy83/go-md2man/v2/md2man) ( =  2.0.3-8.el10) golang-symlink(github.com/cpuguy83/go-md2man/v2) ( =  2.0.3-8.el10)"

URI_golang-github-cpuguy83-md2man-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/golang-github-cpuguy83-md2man-devel-2.0.3-8.el10.noarch.rpm;unpack=0"
RDEPENDS:golang-github-cpuguy83-md2man-devel = "go-filesystem ( ) golang(github.com/russross/blackfriday/v2) ( )"
RPROVIDES:golang-github-cpuguy83-md2man-devel = "golang-ipath(github.com/cpuguy83/go-md2man) ( =  2.0.3-8.el10) golang(github.com/cpuguy83/go-md2man/md2man) ( =  2.0.3-8.el10) golang-github-cpuguy83-md2man-devel ( =  2.0.3-8.el10)"
