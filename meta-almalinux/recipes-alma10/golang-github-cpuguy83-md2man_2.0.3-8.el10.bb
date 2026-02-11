
inherit dnf-bridge

PN = "golang-github-cpuguy83-md2man"
PE = "0"
PV = "2.0.3"
PR = "8.el10"
PACKAGES = "golang-github-cpuguy83-md2man compat-golang-github-cpuguy83-md2man-2-devel golang-github-cpuguy83-md2man-devel"


URI_golang-github-cpuguy83-md2man = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/golang-github-cpuguy83-md2man-2.0.3-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:golang-github-cpuguy83-md2man = " \
 glibc \
"

URI_compat-golang-github-cpuguy83-md2man-2-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/compat-golang-github-cpuguy83-md2man-2-devel-2.0.3-8.el10.noarch.rpm;unpack=0"
RDEPENDS:compat-golang-github-cpuguy83-md2man-2-devel = " \
 golang-github-cpuguy83-md2man-devel \
 go-filesystem \
"

URI_golang-github-cpuguy83-md2man-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/golang-github-cpuguy83-md2man-devel-2.0.3-8.el10.noarch.rpm;unpack=0"
RDEPENDS:golang-github-cpuguy83-md2man-devel = " \
 compat-golang-github-russross-blackfriday-2-devel \
 go-filesystem \
"
